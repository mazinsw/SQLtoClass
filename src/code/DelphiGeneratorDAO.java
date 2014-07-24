package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.OrderFied;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public class DelphiGeneratorDAO extends DelphiGeneratorBase {
	private String classBasePrefix;
	private String classBaseSuffix;

	public DelphiGeneratorDAO(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	public String getClassBasePrefix() {
		return classBasePrefix;
	}

	public void setClassBasePrefix(String classBasePrefix) {
		this.classBasePrefix = classBasePrefix;
	}

	public String getClassBaseSuffix() {
		return classBaseSuffix;
	}

	public void setClassBaseSuffix(String classBaseSuffix) {
		this.classBaseSuffix = classBaseSuffix;
	}

	public List<Field> getKeyFields(Table table) {
		List<Field> list = new ArrayList<>();
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof PrimaryKey))
				continue;
			PrimaryKey pk = (PrimaryKey) constraint;
			for (OrderFied field : pk.getFields()) {
				list.add(table.find(field.getName()));
			}
			break;
		}
		return list;
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println("unit " + getClassName(name) + ";");
		out.println();
		out.println("interface");
		out.println();
		out.println("uses");
		out.println("  " + getBaseClassName(name) + ", ZDataset, SysUtils;");
		out.println();
		out.println("type");
		out.println();
		out.println("  TListar" + name + " = procedure("
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ") of object;");
		out.println();
		out.println("  T" + getClassName(name) + " = class");
		out.println("  private");
		out.println("    class procedure PreencheParametros(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		out.println("    class procedure Listar(Qry: TZQuery; Metodo: TListar" + name
				+ ");");
		out.println("  public");
		out.println("    class procedure CarregaCampos(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		out.println("  public");
		out.println("    class procedure Carregar(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		out.println("    class procedure Inserir(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		out.println("    class procedure Atualizar(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		out.println("    class procedure Excluir(Qry: TZQuery; "
				+ getBaseClassName(name) + ": T" + getBaseClassName(name)
				+ ");");
		String indexField = "";
		if(indexed)
			indexField = "; " + getBaseClassName(name) + "ID: Integer";
		out.println("    class procedure ExcluirTod" + getGenderChar(name)
				+ "s(Qry: TZQuery" + indexField + ");");
		out.println("    class procedure ListarTod" + getGenderChar(name)
				+ "s(Qry: TZQuery" + indexField + "; Metodo: TListar" + name
				+ "; Inicio: Integer = 0; Tamanho: Integer = 0);");
		out.println("  end;");
		int exceptionCount = 0;
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof UniqueKey))
				continue;
			String uniqueFieldName = "";
			if (constraint.getFields().size() > 0)
				uniqueFieldName = constraint.getFields()
						.get(constraint.getFields().size() - 1).getName();
			if (exceptionCount == 0)
				out.println();
			out.println("  E" + name + uniqueFieldName + " = class(Exception);");
			exceptionCount++;
		}
	}

	private void genKeyWhereParams(PrintWriter out, Table table, String name,
			boolean indexed, List<Field> keyFields) {
		if (keyFields.size() > 0)
			out.println(" WHERE ' + ");
		else
			out.println("';");
		String AndStmt = "";
		for (Field field : keyFields) {
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print("    '" + field.getName() + " = :" + field.getName());
			AndStmt = " AND ' + ";
		}
		if (keyFields.size() > 0)
			out.println("';");
	}

	private void genKeyParams(PrintWriter out, Table table, String name,
			boolean indexed, List<Field> keyFields) {
		for (Field field : keyFields) {
			String varName = normalize(field.getName(), false);
			out.println("  Qry.ParamByName('" + field.getName() + "')."
					+ getQueryType(field) + " := " + getBaseClassName(name)
					+ "." + varName + ";");
		}
	}

	private void genKeyWhereSelect(PrintWriter out, Table table,
			Constraint constraint, String name, boolean indexed,
			List<Field> keyFields, boolean update) {
		if (constraint.getFields().size() > 0)
			out.println(" WHERE ' + ");
		else {
			out.println("';");
			return;
		}
		String AndStmt = "";
		for (OrderFied orderField : constraint.getFields()) {
			Field field = table.find(orderField.getName());
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print("      '" + field.getName() + " = :" + field.getName());
			AndStmt = " AND ' + ";
		}
		if(update) {
			for (Field field : keyFields) {
				if (!AndStmt.equals(""))
					out.println(AndStmt);
				out.print("      '" + field.getName() + " <> :" + field.getName());
				AndStmt = " AND ' + ";
			}
		}
		out.println("';");
	}

	private void genKeySelectParams(PrintWriter out, Table table,
			Constraint constraint, String name, boolean indexed,
			List<Field> keyFields, boolean update) {
		for (OrderFied orderField : constraint.getFields()) {
			Field field = table.find(orderField.getName());
			String varName = normalize(field.getName(), false);
			out.println("    Qry.ParamByName('" + field.getName() + "')."
					+ getQueryType(field) + " := " + getBaseClassName(name)
					+ "." + varName + ";");
		}
		if(!update)
			return;
		for (Field field : keyFields) {
			String varName = normalize(field.getName(), false);
			out.println("    Qry.ParamByName('" + field.getName() + "')."
					+ getQueryType(field) + " := " + getBaseClassName(name)
					+ "." + varName + ";");
		}
	}

	private void genKeySelect(PrintWriter out, Table table,
			Constraint constraint, String name, boolean indexed,
			List<Field> keyFields) {
		String CommaStmt = "";
		for (Field field : keyFields) {
			if (!CommaStmt.equals(""))
				out.print(CommaStmt);
			out.print(field.getName());
			CommaStmt = ", ";
		}
	}

	private void genUpdateAssignFields(PrintWriter out, Table table,
			String name, boolean indexed) {
		String AndStmt = "";
		for (Field field : table.getFields()) {
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print("    '" + field.getName() + " = :" + field.getName());
			AndStmt = ", ' + ";
		}
	}

	private void genInsertAssignFields(PrintWriter out, Table table,
			String name, boolean indexed) {
		out.println("(' +");
		String AndStmt = "";
		for (Field field : table.getFields()) {
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print("    ':" + field.getName());
			AndStmt = ", ' + ";
		}
		out.println(")';");
	}
	
	private void genCorrectException(PrintWriter out, Table table,
			String name, boolean indexed,
			List<Field> keyFields, boolean update) {
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof UniqueKey))
				continue;
			if (constraint.getFields().size() == 0)
				continue;
			out.print("    Qry.SQL.Text := 'SELECT ");
			if (keyFields.size() > 0)
				genKeySelect(out, table, constraint, name, indexed, keyFields);
			else
				out.print("*");
			out.print(" FROM " + getTableName(table, name, indexed));
			genKeyWhereSelect(out, table, constraint, name, indexed, keyFields, update);
			genKeySelectParams(out, table, constraint, name, indexed, keyFields, update);
			out.println("    Qry.Open;");
			out.println("    if not Qry.Eof then");
			out.println("    begin");
			out.println("      Qry.Close;");
			Field field = table.find(constraint.getFields()
					.get(constraint.getFields().size() - 1).getName());
			String uniqueFieldName = field.getName();
			String varName = normalize(uniqueFieldName, false);
			String action;
			if (update)
				action = "atualizar";
			else
				action = "inserir";
			out.println("      raise E" + name + uniqueFieldName
					+ ".CreateFmt('Não foi possível " + action + " "
					+ getGenderChar(name) + " " + normalize(name).toLowerCase()
					+ ", " + getGenderChar(uniqueFieldName) + " "
					+ uniqueFieldName.toLowerCase() + " \"%s\" já existe', ["
					+ getBaseClassName(name) + "." + varName + "]);");
			out.println("    end;");
		}
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		List<Field> keyFields = getKeyFields(table);
		out.println();
		out.println("implementation");
		out.println();
		out.println("uses");
		out.println("  Variants;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Carregar(Qry: TZQuery; " + getBaseClassName(name) + ": T"
				+ getBaseClassName(name) + ");");
		out.println("begin");
		out.print("  Qry.SQL.Text := 'SELECT * FROM " + getTableName(table, name, indexed));
		genKeyWhereParams(out, table, name, indexed, keyFields);
		genKeyParams(out, table, name, indexed, keyFields);
		out.println("  Qry.Open;");
		out.println("  if Qry.Eof then");
		out.println("    raise Exception.Create('Não foi possível carregar "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("  CarregaCampos(Qry, " + getBaseClassName(name) + ");");
		out.println("  Qry.Close;");
		out.println("end;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Inserir(Qry: TZQuery; " + getBaseClassName(name) + ": T"
				+ getBaseClassName(name) + ");");
		out.println("begin");
		out.print("  Qry.SQL.Text := 'INSERT INTO " + getTableName(table, name, indexed)
				+ " VALUES ");
		genInsertAssignFields(out, table, name, indexed);
		out.println("  PreencheParametros(Qry, " + getBaseClassName(name)
				+ ");");
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		genCorrectException(out, table, name, indexed, keyFields, false);
		out.println("    raise Exception.Create('Não foi possível inserir "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("  end;");
		out.println("end;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Atualizar(Qry: TZQuery; " + getBaseClassName(name) + ": T"
				+ getBaseClassName(name) + ");");
		out.println("begin");
		out.println("  Qry.SQL.Text := 'UPDATE " + getTableName(table, name, indexed)
				+ " SET ' + ");
		genUpdateAssignFields(out, table, name, indexed);
		genKeyWhereParams(out, table, name, indexed, keyFields);
		out.println("  PreencheParametros(Qry, " + getBaseClassName(name)
				+ ");");
		genKeyParams(out, table, name, indexed, keyFields);
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		genCorrectException(out, table, name, indexed, keyFields, true);
		out.println("    raise Exception.Create('Não foi possível atualizar "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("  end;");
		out.println("end;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Excluir(Qry: TZQuery; " + getBaseClassName(name) + ": T"
				+ getBaseClassName(name) + ");");
		out.println("begin");
		out.print("  Qry.SQL.Text := 'DELETE FROM " + getTableName(table, name, indexed));
		genKeyWhereParams(out, table, name, indexed, keyFields);
		genKeyParams(out, table, name, indexed, keyFields);
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		out.println("    raise Exception.Create('Não foi possível excluir "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("  end;");
		out.println("end;");
		out.println();
		String indexField = "";
		if(indexed)
			indexField = "; " + getBaseClassName(name) + "ID: Integer";
		out.println("class procedure T" + getClassName(name) + ".ExcluirTod"
				+ getGenderChar(name) + "s(Qry: TZQuery" + indexField + ");");
		out.println("begin");
		out.println("  Qry.SQL.Text := 'DELETE FROM " + getTableName(table, name, indexed, true) + "';");
		out.println("  Qry.ExecSQL;");
		out.println("end;");
		out.println();
		out.println("procedure T" + getClassName(name) + ".ListarTod"
				+ getGenderChar(name) + "s(Qry: TZQuery" + indexField + "; Metodo: TListar"
				+ name + "; Inicio, Tamanho: Integer);");
		out.println("var");
		out.println("  LimiteSQL: string;");
		out.println("begin");
		out.println("  LimiteSQL := '';");
		out.println("  if (Tamanho > 0) then");
		out.println("    LimiteSQL := ' LIMIT :LimiteInicio, :LimiteTamanho';");
		out.println("  Qry.SQL.Text := 'SELECT * FROM " + getTableName(table, name, indexed, true)
				+ "' + LimiteSQL;");
		out.println("  if (Tamanho > 0) then");
		out.println("  begin");
		out.println("    Qry.ParamByName('LimiteInicio').AsInteger := Inicio;");
		out.println("    Qry.ParamByName('LimiteTamanho').AsInteger := Tamanho;");
		out.println("  end;");
		out.println("  Listar(Qry, Metodo);");
		out.println("end;");

		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".CarregaCampos(Qry: TZQuery; " + getBaseClassName(name)
				+ ": T" + getBaseClassName(name) + ");");
		out.println("begin");
		for (Field field : table.getFields()) {
			String varName = genArrayAccess(normalize(field.getName(), false));
			String enumItems = genEnum(name, field);
			String funcPrefix = "";
			String funcSuffix = "";
			if (enumItems != null) {
				funcPrefix = "T" + getBaseClassName(name) + ".StringTo" + convertType(name, field, false) + "(";
				funcSuffix = ")";
			}
			out.println("  " + getBaseClassName(name) + "." + varName + " := "
					+ funcPrefix + "Qry.FieldByName('" + field.getName()
					+ "')." + getQueryType(field) + funcSuffix + ";");
		}
		out.println("end;");

		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".PreencheParametros(Qry: TZQuery; " + getBaseClassName(name)
				+ ": T" + getBaseClassName(name) + ");");
		out.println("begin");
		for (Field field : table.getFields()) {
			if (field.getType().getType() == DataType.BLOB)
				continue;
			String varName = genArrayAccess(normalize(field.getName(), false));
			String enumItems = genEnum(name, field);
			if ((!field.isNotNull() || field.isAutoIncrement() || field
					.getValue() != null) && !getNullValue(field).equals("?")) {
				out.println("  if (" + getBaseClassName(name) + "." + varName
						+ " = " + getNullValue(field) + ") then");
				out.println("    Qry.ParamByName('" + field.getName()
						+ "').Value := Null");
				out.println("  else");
				out.print("  ");
			}
			String funcPrefix = "";
			String funcSuffix = "";
			if (enumItems != null) {
				funcPrefix = convertType(name, field, false) + "ToString[";
				funcSuffix = "]";
			}
			out.println("  Qry.ParamByName('" + field.getName() + "')."
					+ getQueryType(field) + " := " + funcPrefix
					+ getBaseClassName(name) + "." + varName + funcSuffix + ";");
		}
		out.println("end;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Listar(Qry: TZQuery; Metodo: TListar" + name + ");");
		out.println("var");
		out.println("  " + getBaseClassName(name) + ": T"
				+ getBaseClassName(name) + ";");
		out.println("begin");
		out.println("  Qry.Open;");
		out.println("  while not Qry.Eof do");
		out.println("  begin");
		out.println("    " + getBaseClassName(name) + " := T"
				+ getBaseClassName(name) + ".Create;");
		out.println("    CarregaCampos(Qry, " + getBaseClassName(name) + ");");
		out.println("    Metodo(" + getBaseClassName(name) + ");");
		out.println("    Qry.Next;");
		out.println("  end;");
		out.println("  Qry.Close;");
		out.println("end;");
	}

	private String getNullValue(Field field) {
		switch (field.getType().getType()) {
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
		case DataType.FLOAT:
		case DataType.DOUBLE:
		case DataType.BIGINT:
		case DataType.INTEGER:
		case DataType.TINYINT:
			return "0";
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
			return "''";
		case DataType.ENUM:
			EnumType type = (EnumType) field.getType();
			if (type.getElements().size() == 1
					&& type.getElements().get(0).matches("[0-9]+"))
				return "0";
			break;
		}
		return "?";
	}

	private String getQueryType(Field field) {
		switch (field.getType().getType()) {
		case DataType.BOOLEAN:
			return "AsBoolean";
		case DataType.DATE:
			return "AsDate";
		case DataType.TIME:
			return "AsTime";
		case DataType.DATETIME:
			return "AsDateTime";
		case DataType.FLOAT:
			return "AsSingle";
		case DataType.DOUBLE:
			return "AsFloat";
		case DataType.BIGINT:
			return "AsLargeInt";
		case DataType.INTEGER:
		case DataType.TINYINT:
			return "AsInteger";
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
			return "AsString";
		case DataType.ENUM:
			EnumType type = (EnumType) field.getType();
			if (type.getElements().size() == 2
					&& ((type.getElements().get(0).equals("Y") && type
							.getElements().get(1).equals("N")) || (type
							.getElements().get(0).equals("N") && type
							.getElements().get(1).equals("Y"))))
				return "AsBoolean";
			if (type.getElements().size() == 1
					&& type.getElements().get(0).matches("[0-9]+"))
				return "AsInteger";
			return "AsString";
		}
		return "Value";
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println();
		out.println("end.");

	}

	private String getBaseClassName(String name) {
		return getClassBasePrefix() + name + getClassBaseSuffix();
	}

	private String getTableName(Table table, String name, boolean indexed) {
		return getTableName(table, name, indexed, false);
	}
	
	private String getTableName(Table table, String name, boolean indexed, boolean nobase) {
		String tableName = table.getName();
		if(!indexed)
			return tableName;
		if (tableName.matches("^[a-zA-Z]+[0-9]+$")) {
			Matcher m = Pattern.compile("^[a-zA-Z]+([0-9]+)$").matcher(tableName);
			m.find();
			tableName = tableName.replaceAll("[0-9]+", "");
			if(nobase)
				return tableName + "' + IntToStr(" + getBaseClassName(name) + "ID) + '";
			return tableName + "' + IntToStr(" + getBaseClassName(name) + "." + getBaseClassName(name) + "ID) + '";
		} else
			return tableName;
	}
	
	

}
