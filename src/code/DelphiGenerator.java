package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.ScriptNode;
import ast.Table;

public class DelphiGenerator extends DelphiGeneratorBase {


	public DelphiGenerator(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		Hashtable<String, String> enumFields = new Hashtable<>();
		List<Field> enumFieldList = new ArrayList<>();

		out.println("unit " + getClassName(name) + ";");
		out.println();
		out.println("interface");
		out.println();
		boolean hasStream = false;
		for (Field field : table.getFields()) {
			if (field.getType().getType() == DataType.BLOB) {
				out.println("uses");
				out.println("  Classes;");
				out.println();
				hasStream = true;
				break;
			}
		}
		out.println("type");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			if (enumFields.containsKey(varName))
				continue;
			String enumItems = genEnum(name, field);
			if (enumItems == null)
				continue;
			out.println("  " + convertType(name, field) + " = (" + enumItems
					+ ");");
			enumFields.put(varName, enumItems);
			enumFieldList.add(field);
		}
		if (enumFields.size() > 0)
			out.println();
		out.println("  T" + getClassName(name) + " = class");
		out.println("  private");
		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, String> usedFields = new Hashtable<>();
		List<String> getAndSetters = new ArrayList<>();

		processArray(table, indexedFields);

		if (indexed)
			out.println("    F" + name + "ID: Integer;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				String varDecl = "    F" + varName + ": array["
						+ genArray(data) + "] of " + convertType(name, field)
						+ ";";
				String params = genParams(data, ",");
				String getDecl = "    function Get" + varName + "(" + params
						+ ": Integer): " + convertType(name, field) + ";";
				String setDecl = "    procedure Set" + varName + "(" + params
						+ ": Integer; Value: " + convertType(name, field)
						+ ");";
				out.println(varDecl);
				getAndSetters.add(getDecl);
				getAndSetters.add(setDecl);
				usedFields.put(varName, data);
			} else {
				out.println("    F" + varName + ": " + convertType(name, field)
						+ ";");
				if (field.getType().getType() == DataType.BLOB) {
					String setDecl = "    procedure Set" + varName + "(Value: "
							+ convertType(name, field) + ");";
					getAndSetters.add(setDecl);
				}
			}
		}
		for (String string : getAndSetters) {
			out.println(string);
		}
		out.println("  public");
		usedFields.clear();
		if (hasStream) {
			out.println("    destructor Destroy; override;");
		}
		for (Field field : enumFieldList) {
			out.println("    class function StringTo"
					+ convertType(name, field, false)
					+ "(const Value: string): " + convertType(name, field)
					+ ";");
		}
		out.println("    procedure Assign(Value: T" + getClassName(name)
				+ ");");
		if (indexed)
			out.println("    property " + name + "ID: Integer read F" + name
					+ "ID write F" + name + "ID;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, data);
				out.println("    property " + varName + "["
						+ genParams(data, ",") + ": Integer]: "
						+ convertType(name, field) + " read Get" + varName
						+ " write Set" + varName + ";");
			} else if (field.getType().getType() == DataType.BLOB) {
				out.println("    property " + varName + ": "
						+ convertType(name, field) + " read F" + varName
						+ " write Set" + varName + ";");
			} else {
				out.println("    property " + varName + ": "
						+ convertType(name, field) + " read F" + varName
						+ " write F" + varName + ";");
			}
		}
		out.println("  end;");
		out.println();
		if (enumFieldList.size() > 0) {
			out.println("const");
			for (Field field : enumFieldList) {
				String enumAsString = genEnumString(name, field);
				String enumAsInteger = genEnumInteger(name, field);
				String typeEnum = convertType(name, field);
				String enumTypeName = convertType(name, field, false);
				out.println("  " + enumTypeName + "ToString: array[" + typeEnum
						+ "] of string = (" + enumAsString + ");");
				out.println("  " + enumTypeName + "ToIndex: array[" + typeEnum
						+ "] of Integer = (" + enumAsInteger + ");");
				EnumType enumType = (EnumType) field.getType();
				String arrayName = "IndexTo" + enumTypeName;
				String enumItems = genEnum(name, field);
				out.println("  " + arrayName + ": array[0.."
						+ (enumType.getElements().size() - 1) + "] of "
						+ typeEnum + " = (" + enumItems + ");");
			}
			out.println();
		}
	}

	private String genEnumInteger(String name, Field field) {
		EnumType enumType = (EnumType) field.getType();
		String res = "";
		if(enumType.getElements().size() > 0)
			res = "0";
		for (int i = 1; i < enumType.getElements().size(); i++) {
			res = res + ", " + i;			
		}
		return res;
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println("implementation");

		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, String> usedFields = new Hashtable<>();
		Hashtable<String, String> enumFields = new Hashtable<>();

		processArray(table, indexedFields);
		boolean hasStream = false, hasEnum = false;
		for (Field field : table.getFields()) {
			if (field.getType().getType() == DataType.BLOB) {
				hasStream = true;
				if (hasEnum)
					break;
			} else if (field.getType().getType() == DataType.ENUM) {
				String enumItems = genEnum(name, field);
				if (enumItems == null)
					continue;
				hasEnum = true;
				if (hasStream)
					break;
			}
		}
		if (indexedFields.size() > 0 || hasEnum) {
			out.println();
			out.println("uses");
			out.println("  SysUtils;");
		}
		out.println();
		out.println("{ T" + getClassName(name) + " }");
		if (hasStream) {
			out.println();
			out.println("destructor T" + getClassName(name) + ".Destroy;");
			out.println("begin");
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
						|| varName
								.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$"))
					continue;
				if (field.getType().getType() == DataType.BLOB) {
					out.println("  if F" + varName + " <> nil then");
					out.println("    F" + varName + ".Free;");
				}
			}
			out.println("  inherited;");
			out.println("end;");
		}
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			if (enumFields.containsKey(varName))
				continue;
			String enumItems = genEnum(name, field);
			if (enumItems == null)
				continue;
			out.println();
			String enumTypeName = convertType(name, field, false);
			out.println("class function T" + getClassName(name)
					+ ".StringTo" + enumTypeName + "(const Value: string): "
					+ convertType(name, field) + ";");
			EnumType enumType = (EnumType) field.getType();
			String arrayName = "IndexTo" + enumTypeName;
			String typeEnum = convertType(name, field);
			out.println("var");
			out.println("  I: Integer;");
			out.println("begin");
			out.println("  for I := 0 to "
					+ (enumType.getElements().size() - 1) + " do");
			out.println("  begin");
			out.println("    if (" + enumTypeName + "ToString[" + arrayName
					+ "[I]] = Value) then");
			out.println("    begin");
			out.println("      Result := " + arrayName + "[I];");
			out.println("      Exit;");
			out.println("    end;");
			out.println("  end;");
			out.println("  raise Exception.CreateFmt('Não foi possível converter de \"%s\" para "
					+ typeEnum + "', [Value]);");
			out.println("end;");
			enumFields.put(varName, enumItems);
		}
		out.println();
		out.println("procedure T" + getClassName(name) + ".Assign(Value: T"
				+ getClassName(name) + ");");
		if (indexedFields.size() > 0) {
			out.println("var");
			String varList = "";
			int sz = 0;
			for (String data : indexedFields.values()) {
				int i = data.split(";").length;
				if (sz < i)
					sz = i;
			}
			String sep = "";
			char ch = 'I';
			for (int i = 0; i < sz; i++) {
				varList += sep + ch;
				sep = ", ";
				ch++;
			}
			out.println("  " + varList + ": Integer;");
		}
		out.println("begin");
		if (indexed)
			out.println("  F" + name + "ID := Value.F" + name + "ID;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, data);
				String[] values = data.split(";");
				String spacing = "  ";
				char ch = 'I';
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println(spacing + "for " + ch + " := " + minIndex
							+ " to " + maxIndex + " do");
					if (i < values.length - 1)
						out.println(spacing + "begin");
					spacing += "  ";
					ch++;
				}
				ch = 'I';
				String sep = "";
				String varList = "";
				for (int i = 0; i < values.length; i++) {
					varList += sep + ch;
					sep = ", ";
					ch++;
				}
				out.println(spacing + "F" + varName + "[" + varList
						+ "] := Value.F" + varName + "[" + varList + "];");
				for (int i = values.length - 1; i >= 0; i--) {
					spacing = spacing.substring(2);
					if (i < values.length - 1)
						out.println(spacing + "end;");
				}
			} else if(field.getType().getType() == DataType.BLOB) {
				out.println("  Set" + varName + "(Value.F" + varName + ");");
			} else {
				out.println("  F" + varName + " := Value.F" + varName + ";");
			}
		}
		out.println("end;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$"))
				continue;
			if (field.getType().getType() == DataType.BLOB) {
				out.println();
				out.println("procedure T" + getClassName(name) + ".Set"
						+ varName + "(Value: " + convertType(name, field)
						+ ");");
				out.println("var");
				out.println("  Position: Int64;");
				out.println("begin");
				out.println("  if F" + varName + " = Value then");
				out.println("    Exit;");
				out.println("  if Value = nil then");
				out.println("  begin");
				out.println("    if F" + varName + " <> nil then");
				out.println("      F" + varName + ".Free;");
				out.println("    F" + varName + " := nil;");
				out.println("  end");
				out.println("  else");
				out.println("  begin");
				out.println("    if F" + varName + " = nil then");
				out.println("      F" + varName + " := TMemoryStream.Create;");
				out.println("    Position := Value.Position;");
				out.println("    Value.Position := 0;");
				out.println("    F" + varName + ".Size := 0;");
				out.println("    F" + varName + ".CopyFrom(Value, Value.Size);");
				out.println("    Value.Position := Position;");
				out.println("  end;");
				out.println("end;");
			}
		}
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (!varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					&& !varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$"))
				continue;
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			if (usedFields.containsKey(varName))
				continue;
			String data = indexedFields.get(varName);
			usedFields.put(varName, data);
			String[] values = data.split(";");

			out.println();
			String params = genParams(data, ",");
			out.println("function T" + getClassName(name) + ".Get"
					+ varName + "(" + params + ": Integer): "
					+ convertType(name, field) + ";");
			out.println("begin");
			String[] paramNames = params.split(", ");
			for (int i = 0; i < values.length; i++) {
				String[] interval = values[i].split(":");
				int minIndex = Integer.valueOf(interval[0]);
				int maxIndex = Integer.valueOf(interval[1]);
				out.println("  if (" + paramNames[i] + " < " + minIndex
						+ ") or (" + paramNames[i] + " > " + maxIndex
						+ ") then");
				out.println("    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', ["
						+ paramNames[i]
						+ ", "
						+ minIndex
						+ ","
						+ maxIndex
						+ "]);");
			}
			out.println("  Result := F" + varName + "[" + params + "];");
			out.println("end;");
			out.println();
			out.println("procedure T" + getClassName(name) + ".Set"
					+ varName + "(" + params + ": Integer; Value: "
					+ convertType(name, field) + ");");
			out.println("begin");
			for (int i = 0; i < values.length; i++) {
				String[] interval = values[i].split(":");
				int minIndex = Integer.valueOf(interval[0]);
				int maxIndex = Integer.valueOf(interval[1]);
				out.println("  if (" + paramNames[i] + " < " + minIndex
						+ ") or (" + paramNames[i] + " > " + maxIndex
						+ ") then");
				out.println("    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', ["
						+ paramNames[i]
						+ ", "
						+ minIndex
						+ ","
						+ maxIndex
						+ "]);");
			}
			out.println("  F" + varName + "[" + params + "] := Value;");
			out.println("end;");

		}
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println();
		out.println("end.");
	}

}
