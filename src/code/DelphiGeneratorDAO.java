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
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public class DelphiGeneratorDAO extends DelphiGeneratorBase {
	private String classBasePrefix;
	private String classBaseSuffix;
	private boolean inherited;

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

	public static String getExceptionName(String name, Constraint constraint) {
		String uniqueFieldName = constraint.getFields()
					.get(constraint.getFields().size() - 1).getName();
		String normalized = normalize(uniqueFieldName, false).replace("][", "_").replace("[", "").replace("]", "");
		return "E" + name + normalized;
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
		String listVarName = getBaseClassName(name);
		String classParam = "; " + getBaseClassName(name) + ": T" + getBaseClassName(name);
		String inheritedClass = "", staticMember = "class ";
		if(isInherited()) {
			listVarName = getClassName(name);
			out.println("  T" + getClassName(name) + " = class;");
			inheritedClass = "(T" + getBaseClassName(name) + ")";
			staticMember = "";
			classParam = "";
		}
		out.println("  TListar" + name + " = procedure("
				+ listVarName + ": T" + listVarName
				+ ") of object;");
		out.println();
		out.println("  T" + getClassName(name) + " = class" + inheritedClass);
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
		if(isInherited()) {
			out.println("    class procedure CarregaCamposEx(Qry: TZQuery; "
					+ getClassName(name) + ": T" + getClassName(name)
					+ ");");
		}
		out.println("  public");
		List<Constraint> uniqueList = getUniqueConstraints(table);
		if(uniqueList.size() > 0) {
			out.println("    " + staticMember + "function Procurar(Qry: TZQuery" + classParam + "): Boolean;");
		}
		out.println("    " + staticMember + "procedure Carregar(Qry: TZQuery" + classParam + ");");
		for (Field field : table.getFields()) {
			if (field.getType().getType() != DataType.BLOB)
				continue;
			String varName = genArrayAccess(normalize(field.getName(), false));
			out.println("    " + staticMember + "procedure Carregar" + varName + "(Qry: TZQuery" + classParam + ");");
			out.println("    " + staticMember + "procedure Atualizar" + varName + "(Qry: TZQuery" + classParam + ");");
		}
		out.println("    " + staticMember + "procedure Inserir(Qry: TZQuery" + classParam + ");");
		out.println("    " + staticMember + "procedure Atualizar(Qry: TZQuery" + classParam + ");");
		if(uniqueList.size() > 0) {
			out.println("    " + staticMember + "procedure Substituir(Qry: TZQuery" + classParam + ");");
		}
		out.println("    " + staticMember + "procedure Excluir(Qry: TZQuery" + classParam + ");");
		String indexField = "";
		if(indexed)
			indexField = "; " + getBaseClassName(name) + "ID: Integer";
		out.println("    class procedure ExcluirTod" + getGenderChar(name)
				+ "s(Qry: TZQuery" + indexField + ");");
		out.println("    class procedure ListarTod" + getGenderChar(name)
				+ "s(Qry: TZQuery" + indexField + "; Metodo: TListar" + name
				+ ";");
		out.println("      Inicio: Integer = 0; Tamanho: Integer = 0);");
		out.println("  end;");
		int exceptionCount = 0;
		for (Constraint constraint : table.getConstraints()) {
			if (!((constraint instanceof PrimaryKey) || (constraint instanceof UniqueKey)))
				continue;
			if (exceptionCount == 0)
				out.println();
			out.println("  " + getExceptionName(name, constraint)  + " = class(Exception);");
			exceptionCount++;
		}
	}

	private void genWhereParams(PrintWriter out, Table table, String name,
			boolean indexed, List<Field> keyFields) {
		if (keyFields.size() > 0) {
			out.println(" ' +");
			out.print("    'WHERE ");
		} else
			out.println("';");
		String AndStmt = "", space = "";
		for (Field field : keyFields) {
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print(space + field.getName() + " = :" + field.getName());
			space = "    '";
			AndStmt = " AND ' + ";
		}
		if (keyFields.size() > 0)
			out.println("';");
	}

	private void genSetParams(PrintWriter out, Table table, String name,
			boolean indexed, List<Field> keyFields) {
		for (Field field : keyFields) {
			String varName = normalize(field.getName(), false);
			writeSetParam(out, name, field, varName, "  ");
		}
	}

	private void genUpdateAssignFields(PrintWriter out, Table table,
			String name, boolean indexed) {
		String AndStmt = "";
		for (Field field : table.getFields()) {
			if (field.getType().getType() == DataType.BLOB) {
				out.println("' +");
				out.println(" // '" + field.getName() + " = :" + field.getName() + " ' + ");
				out.print("    '");
				continue;
			}
			if (field.getType().getType() == DataType.DATETIME && getDateFromDB(field)) {
				out.println("' +");
				out.println(" // '" + field.getName() + " = :" + field.getName() + " ' + ");
				out.print("    '");
				continue;
			}
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			out.print("    '" + field.getName() + " = :" + field.getName());
			AndStmt = ", ' + ";
		}
	}
	
	private List<Field> getAutoFields(Table table) {
		List<Field> list = new ArrayList<>();
		for (Field field : table.getFields()) {
			if (field.getType().getType() == DataType.DATETIME && getDateFromDB(field)) {
				list.add(field);
			}
		}
		return list;
	}

	private void genInsertAssignFields(PrintWriter out, Table table,
			String name, boolean indexed) {
		out.println("(' +");
		String AndStmt = "";
		for (Field field : table.getFields()) {
			if (!AndStmt.equals(""))
				out.println(AndStmt);
			if (field.getType().getType() == DataType.DATETIME && getDateFromDB(field)) {
				out.print(" {* " + field.getName() + " *} 'NOW()");
				continue;
			}
			out.print("    ':" + field.getName());
			AndStmt = ", ' + ";
		}
		out.println(")';");
	}
	
	private void genCorrectException(PrintWriter out, Table table,
			String name, boolean indexed,
			List<Field> keyFields, boolean update) {
		for (Constraint constraint : table.getConstraints()) {
			if (!((constraint instanceof PrimaryKey) || (constraint instanceof UniqueKey)))
				continue;
			out.println("      if StrUtils.ContainsText(E.Message, '''"
						+ constraint.getName() + "''') then");
			out.println("      begin");
			Field field = table.find(constraint.getFields()
					.get(constraint.getFields().size() - 1).getName());
			if(field == null)
				throw new RuntimeException("Restrição ou índice inconsistente, a coluna `" + constraint.getFields()
						.get(constraint.getFields().size() - 1).getName() + "` não faz parte da tabela `" + table.getName() + "`");
			String uniqueFieldName = field.getName();
			String varName = normalize(uniqueFieldName, false);
			String action;
			if (update)
				action = "atualizar";
			else
				action = "inserir";
			String ugc = getGenderChar(uniqueFieldName);
			String lgc = ugc.toLowerCase();
			out.println("        raise " + getExceptionName(name, constraint)
					+ ".CreateFmt('Não foi possível " + action + " "
					+ getGenderChar(name) + " " + normalize(name).toLowerCase()
					+ ", ' +");
			out.println("          '" + ugc + " "
					+ upperFix(uniqueFieldName.toLowerCase()) + " \"" + getFormatFromType(field) + "\" já está cadastrad" + lgc + "', ["
					+ getGetParam(name, field, varName) + "]);");
			out.println("      end;");
		}
	}

	private String getFormatFromType(Field field) {
		switch (field.getType().getType()) {
		case DataType.STRING:
		case DataType.CHAR:
		case DataType.TEXT:
		case DataType.ENUM:
			return "%s";
		case DataType.FLOAT:
		case DataType.DOUBLE:
		case DataType.DECIMAL:
			return "%f";
		default:
			return "%d";
		}
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		PrimaryKey primaryKey = getPrimaryKey(table);
		List<Field> keyFields = getFields(table, primaryKey);
		String listVarName = getBaseClassName(name);
		String loadVarName = listVarName;
		String classParam = "; " + getBaseClassName(name) + ": T" + getBaseClassName(name);
		String staticMember = "class ", exLoad = "";
		if(isInherited()) {
			listVarName = getClassName(name);
			staticMember = "";
			classParam = "";
			exLoad = "Ex";
			loadVarName = "Self";
		}
		List<Constraint> uniqueList = getUniqueConstraints(table);
		out.println();
		out.println("implementation");
		out.println();
		out.println("uses");
		out.println("  Variants, StrUtils, DBUtils, DB, Classes;");
		out.println();
		out.println("{ T" + getClassName(name) + " }");
		if(uniqueList.size() > 0) {
			List<Field> uniqueFields = getFields(table, uniqueList.get(0));
			out.println();
			out.println(staticMember + "function T" + getClassName(name)
					+ ".Procurar(Qry: TZQuery" + classParam + "): Boolean;");
			if(isInherited()) {
				out.println("var");
				out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
			}
			out.println("begin");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + " := Self;");
			}
			out.print("  Qry.SQL.Text := 'SELECT * FROM " + getTableName(table, name, indexed));
			genWhereParams(out, table, name, indexed, uniqueFields);
			genSetParams(out, table, name, indexed, uniqueFields);
			out.println("  Qry.Open;");
			out.println("  Result := not Qry.Eof;");
			out.println("  if Result then");
			out.println("    CarregaCampos" + exLoad + "(Qry, " + loadVarName + ");");
			out.println("  Qry.Close;");
			out.println("end;");
		}
		out.println();
		out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Carregar(Qry: TZQuery" + classParam + ");");
		if(isInherited()) {
			out.println("var");
			out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
		}
		out.println("begin");
		if(isInherited()) {
			out.println("  " + getBaseClassName(name) + " := Self;");
		}
		out.print("  Qry.SQL.Text := 'SELECT * FROM " + getTableName(table, name, indexed));
		genWhereParams(out, table, name, indexed, keyFields);
		genSetParams(out, table, name, indexed, keyFields);
		out.println("  Qry.Open;");
		out.println("  if Qry.Eof then");
		out.println("    raise " + getExceptionName(name, primaryKey) +  ".Create('Não foi possível carregar "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("  CarregaCampos" + exLoad + "(Qry, " + loadVarName + ");");
		out.println("  Qry.Close;");
		out.println("end;");
		out.println();
		// generate procedure to load a blob field
		for (Field field : table.getFields()) {
			if (field.getType().getType() != DataType.BLOB)
				continue;
			String varName = genArrayAccess(normalize(field.getName(), false));
			out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Carregar" + varName + "(Qry: TZQuery" + classParam + ");");
			out.println("var");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
			}
			out.println("  FStream: TStream;");
			out.println("begin");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + " := Self;");
			}
			out.print  ("  Qry.SQL.Text := 'SELECT Imagem FROM " + getTableName(table, name, indexed));
			genWhereParams(out, table, name, indexed, keyFields);
			genSetParams(out, table, name, indexed, keyFields);
			out.println("  Qry.Open;");
			out.println("  if Qry.Eof then");
			out.println("    Exit;");
			out.println("  if Qry.FieldByName('" + field.getName() + "').IsNull then");
			out.println("    " + getBaseClassName(name) + "." + varName + " := nil");
			out.println("  else");
			out.println("  begin");
			out.println("    FStream := TMemoryStream.Create;");
			out.println("    TBlobField(Qry.FieldByName('" + field.getName() + "')).SaveToStream(FStream);");
			out.println("    " + getBaseClassName(name) + "." + varName + " := FStream;");
			out.println("    FStream.Free;");
			out.println("  end;");
			out.println("  Qry.Close;");
			out.println("end;");
			out.println();
		}
		out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Inserir(Qry: TZQuery" + classParam + ");");
		if(isInherited()) {
			out.println("var");
			out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
		}
		out.println("begin");
		if(isInherited()) {
			out.println("  " + getBaseClassName(name) + " := Self;");
		}
		out.print("  Qry.SQL.Text := 'INSERT INTO " + getTableName(table, name, indexed)
				+ " VALUES ");
		genInsertAssignFields(out, table, name, indexed);
		out.println("  PreencheParametros(Qry, " + getBaseClassName(name)
				+ ");");
		// generate fill blob field on insert
		for (Field field : table.getFields()) {
			if (field.getType().getType() != DataType.BLOB)
				continue;
			String varName = genArrayAccess(normalize(field.getName(), false));
			if (!field.isNotNull()) {
				out.println("  if (" + getBaseClassName(name) + "." + varName
						+ " <> nil) then");
				out.println("  begin");
				out.println("    " + getBaseClassName(name) + "." + varName + ".Position := 0;");
				out.println("    Qry.ParamByName('" + field.getName()
						+ "').LoadFromStream(" + getBaseClassName(name) + "." + varName + ", ftBlob);");
				out.println("  end");
				out.println("  else");
				out.println("    Qry.ParamByName('" + field.getName() + "').Value := Null;");
			}
		}
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		out.println("    on E: Exception do");
		out.println("    begin");
		genCorrectException(out, table, name, indexed, keyFields, false);
		out.println("      raise Exception.Create('Não foi possível inserir "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("    end;");
		out.println("  end;");
		genGetInsertID(out, name, table, keyFields);
		List<Field> autoFields = getAutoFields(table);
		for (Field field : autoFields) {
			String varName = genArrayAccess(normalize(field.getName(), false));
			out.println("  " + getBaseClassName(name) + "." + varName + " := Now;");
		}
		out.println("end;");
		out.println();
		out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Atualizar(Qry: TZQuery" + classParam + ");");
		if(isInherited()) {
			out.println("var");
			out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
		}
		out.println("begin");
		if(isInherited()) {
			out.println("  " + getBaseClassName(name) + " := Self;");
		}
		out.println("  Qry.SQL.Text := 'UPDATE " + getTableName(table, name, indexed)
				+ " SET ' + ");
		genUpdateAssignFields(out, table, name, indexed);
		genWhereParams(out, table, name, indexed, keyFields);
		out.println("  PreencheParametros(Qry, " + getBaseClassName(name)
				+ ");");
		genSetParams(out, table, name, indexed, keyFields);
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		out.println("    on E: Exception do");
		out.println("    begin");
		genCorrectException(out, table, name, indexed, keyFields, true);
		out.println("      raise Exception.Create('Não foi possível atualizar "
				+ getGenderChar(name) + " " + normalize(name).toLowerCase() + "');");
		out.println("    end;");
		out.println("  end;");
		out.println("end;");
		if(uniqueList.size() > 0) {
			out.println();
			out.println(staticMember + "procedure T" + getClassName(name)
					+ ".Substituir(Qry: TZQuery" + classParam + ");");
			out.println("var");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
			}
			out.println("  " + getClassName(name) + ": T" + listVarName + ";");
			out.println("begin");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + " := Self;");
			}
			out.println("  " + getClassName(name) + " := T" + listVarName + ".Create;");
			out.println("  try");
			out.println("    T" + getBaseClassName(name) + "(" + getClassName(name) + ").Assign(" + getBaseClassName(name) + ");");
			if(isInherited()) {
				out.println("    if " + getClassName(name) + ".Procurar(Qry) then");
			} else {
				out.println("    if T" + getClassName(name) + ".Procurar(Qry, " + getClassName(name) + ") then");
			}
			out.println("    begin");
			for (Field field : keyFields) {
				String varName = normalize(field.getName(), false);
				out.println("      " + getBaseClassName(name) + "." + varName + " := " + getClassName(name) + "." + varName + ";");
			}
			if(isInherited()) {
				out.println("      Atualizar(Qry);");
			} else {
				out.println("      Atualizar(Qry, " + getBaseClassName(name) + ");");
			}
			out.println("    end");
			out.println("    else");
			if(isInherited()) {
				out.println("      Inserir(Qry);");
			} else {
				out.println("      Inserir(Qry, " + getBaseClassName(name) + ");");
			}
			out.println("  finally");
			out.println("    " + getClassName(name) + ".Free;");
			out.println("  end;");
			out.println("end;");
		}
		out.println();
		// generate procedure to update a blob field
		for (Field field : table.getFields()) {
			if (field.getType().getType() != DataType.BLOB)
				continue;
			String varName = genArrayAccess(normalize(field.getName(), false));
			out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Atualizar" + varName + "(Qry: TZQuery" + classParam + ");");
			if(isInherited()) {
				out.println("var");
				out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
			}
			out.println("begin");
			if(isInherited()) {
				out.println("  " + getBaseClassName(name) + " := Self;");
			}
			out.print("  Qry.SQL.Text := 'UPDATE " + getTableName(table, name, indexed) + " SET " + field.getName() + " = :" + field.getName() + "");
			genWhereParams(out, table, name, indexed, keyFields);
			genSetParams(out, table, name, indexed, keyFields);
			out.println("  if " + getBaseClassName(name) + "." + varName + " <> nil then");
			out.println("  begin");
			out.println("    " + getBaseClassName(name) + "." + varName + ".Position := 0;");
			out.println("    Qry.ParamByName('" + field.getName() + "').LoadFromStream(" + getBaseClassName(name) + "." + varName + ", ftBlob);");
			out.println("  end");
			out.println("  else");
			out.println("    Qry.ParamByName('" + field.getName() + "').Value := Null;");
			out.println("  try");
			out.println("    Qry.ExecSQL;");
			out.println("  except");
			out.println("    raise Exception.Create('Não foi possível atualizar " + getGenderChar(varName) + " " + 
					normalize(varName).toLowerCase() + " d" + getGenderChar(table.getName()) + " " + 
					normalize(table.getName()).toLowerCase() + "');");
			out.println("  end;");
			out.println("end;");
			out.println();
		}
		out.println(staticMember + "procedure T" + getClassName(name)
				+ ".Excluir(Qry: TZQuery" + classParam + ");");
		if(isInherited()) {
			out.println("var");
			out.println("  " + getBaseClassName(name) + ": T" + getBaseClassName(name) + ";");
		}
		out.println("begin");
		if(isInherited()) {
			out.println("  " + getBaseClassName(name) + " := Self;");
		}
		out.print("  Qry.SQL.Text := 'DELETE FROM " + getTableName(table, name, indexed));
		genWhereParams(out, table, name, indexed, keyFields);
		genSetParams(out, table, name, indexed, keyFields);
		out.println("  try");
		out.println("    Qry.ExecSQL;");
		out.println("  except");
		out.println("    raise " + getExceptionName(name, primaryKey) + ".Create('Não foi possível excluir "
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
		out.println("class procedure T" + getClassName(name) + ".ListarTod"
				+ getGenderChar(name) + "s(Qry: TZQuery" + indexField + "; Metodo: TListar"
				+ name + ";");
		out.println("  Inicio, Tamanho: Integer);");
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


		if(isInherited()) {
			out.println();
			out.println("class procedure T" + getClassName(name)
					+ ".CarregaCamposEx(Qry: TZQuery; " + getClassName(name)
					+ ": T" + getClassName(name) + ");");
			out.println("begin");
			out.println("  CarregaCampos(Qry, " + getClassName(name) + ");");
			out.println("end;");
		}
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".CarregaCampos(Qry: TZQuery; " + getBaseClassName(name)
				+ ": T" + getBaseClassName(name) + ");");
		out.println("begin");
		for (Field field : table.getFields()) {
			String varName = genArrayAccess(normalize(field.getName(), false));
			if (field.getType().getType() == DataType.BLOB) {
				out.println("  // Usar função Carregar" + varName + "()");
				continue;
			}
			String enumItems = genEnum(name, field);
			String funcPrefix = "";
			String funcSuffix = "";
			if (enumItems != null) {
				funcPrefix = "T" + getBaseClassName(name) + ".StringTo" + convertType(name, field, false) + "(";
				funcSuffix = ")";
				if(!field.isNotNull()) {
					out.println("  if not Qry.FieldByName('" + field.getName()
					+ "').IsNull then");
					out.print("  ");
				}
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
			String varName = genArrayAccess(normalize(field.getName(), false));
			if (field.getType().getType() == DataType.BLOB){
				out.println("  // Usar função Atualizar" + varName + "()");
				continue;
			}
			if (field.getType().getType() == DataType.DATETIME && getDateFromDB(field)) {
				out.println("  // Usando NOW() em vez de " + field.getName());
				continue;
			}
			if ((!field.isNotNull() || field.isAutoIncrement()) && !getNullValue(field).equals("?")) {
				out.println("  if (" + getBaseClassName(name) + "." + varName
						+ " = " + getNullValue(field) + ") then");
				out.println("    Qry.ParamByName('" + field.getName()
						+ "').Value := Null");
				out.println("  else");
				out.print("  ");
			}
			writeSetParam(out, name, field, varName, "  ");
		}
		out.println("end;");
		out.println();
		out.println("class procedure T" + getClassName(name)
				+ ".Listar(Qry: TZQuery; Metodo: TListar" + name + ");");
		out.println("var");
		out.println("  " + listVarName + ": T"
				+ listVarName + ";");
		out.println("begin");
		out.println("  Qry.Open;");
		out.println("  while not Qry.Eof do");
		out.println("  begin");
		out.println("    " + listVarName + " := T"
				+ listVarName + ".Create;");
		out.println("    CarregaCampos" + exLoad + "(Qry, " + listVarName + ");");
		out.println("    Metodo(" + listVarName + ");");
		out.println("    Qry.Next;");
		out.println("  end;");
		out.println("  Qry.Close;");
		out.println("end;");
	}

	private boolean getDateFromDB(Field field) {
		return field.getName().contains("DataHora") || field.getName().contains("DataCadastro") || field.getName().contains("DataAtualizacao") || field.isNotNull();
	}

	private void genGetInsertID(PrintWriter out, String name, Table table, List<Field> keyFields) {
		if(keyFields.size() != 1)
			return;
		Field pkField = keyFields.get(0);
		if(!pkField.isAutoIncrement())
			return;
		String varName = genArrayAccess(normalize(pkField.getName(), false));
		out.println("  if " + getBaseClassName(name) + "." + varName + " = 0 then");
		out.println("    " + getBaseClassName(name) + "." + varName + " := TDBUtil.GetLastInsertedID(Qry);");
	}

	private String getNullValue(Field field) {
		switch (field.getType().getType()) {
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
		case DataType.FLOAT:
		case DataType.DECIMAL:
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

	private String getParamType(Field field) {
		switch (field.getType().getType()) {
		case DataType.DATE:
			return "AsDate";
		case DataType.TIME:
			return "AsTime";
		default:
			return getQueryType(field);
		}
	}
	private String getQueryType(Field field) {
		switch (field.getType().getType()) {
		case DataType.BOOLEAN:
			return "AsBoolean";
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
			return "AsDateTime";
		case DataType.FLOAT:
			return "AsSingle";
		case DataType.DOUBLE:
			return "AsFloat";
		case DataType.DECIMAL:
			return "AsCurrency";
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
	
	private void writeSetParam(PrintWriter out, String name, Field field, String varName, String indent) {
		out.println(indent + "Qry.ParamByName('" + field.getName() + "')."
				+ getParamType(field) + " := " + getGetParam(name, field, varName) + ";");
	}
	
	private String getGetParam(String name, Field field, String varName) {
		String enumItems = genEnum(name, field);
		String funcPrefix = "";
		String funcSuffix = "";
		if (enumItems != null) {
			funcPrefix = convertType(name, field, false) + "ToString[";
			funcSuffix = "]";
		}
		return funcPrefix + getBaseClassName(name) + "." + varName + funcSuffix;
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
				return tableName + "' + IntToStr(" + name + "ID) + '";
			return tableName + "' + IntToStr(" + getBaseClassName(name) + "." + name + "ID) + '";
		} else
			return tableName;
	}

	public boolean isInherited() {
		return inherited;
	}

	public void setInherited(boolean inherited) {
		this.inherited = inherited;
	}
	
	

}
