package code;

import java.io.PrintWriter;
import java.util.List;

import ast.ScriptNode;

public class PHPGeneratorDB extends PHPGeneratorBase {

	public PHPGeneratorDB(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	protected void genSQLGetFromPrimaryKey(PrintWriter out, String className,
			String tblname, String indexStr, String arrElem) {
		out.println("\t\treturn new " + className + "(DB::GetTableRow('"
				+ tblname + "'" + indexStr + ", array(" + arrElem
				+ ")));");
	}

	@Override
	protected void genSQLDelete(PrintWriter out, String tblname,
			String indexStr, String arrElem) {
		out.println("\t\treturn DB::Delete('" + tblname + "'"
				+ indexStr + ", array(" + arrElem + "));");
	}

	@Override
	protected void genSQLInsert(PrintWriter out, String tblname, String indexStr, 
			String pkName, String unixName) {
		out.print("\t\t");
		if(pkName != null)
			out.print("$_" + unixName + "['" + pkName + "'] = ");
		out.println("DB::Insert('" + tblname + "'" + indexStr + ", $_"
				+ unixName + ");");
	}

	@Override
	protected void genSQLUpdate(PrintWriter out, String tblname,
			String indexStr, List<String> ukNames, String unixName) {
		out.println("\t\t$table = new Table('" + tblname + "'" + indexStr
				+ ", $_" + unixName + ");");
		if(ukNames.size() == 1)
			out.println("\t\t$table->SetPk('" + ukNames.get(0)  + "', $_" + unixName
				+ "['" + ukNames.get(0) + "']);");
		else
			out.println("\t\t// TODO: foreach unique fields");
		out.println("\t\tif(!$table->Update($campos))");
		out.println("\t\t\tthrow new Exception('Falha ao atualizar " + getGenderChar(tblname) + " " + unixName +"');");
	}

	@Override
	protected void genSQLGetTodos(PrintWriter out, String tblname,
			String indexStr, String pkName, String unixName) {
		out.println("\t\t$query = array();");
		if(pkName != null)
			out.println("\t\t$query['order'] = 'ORDER BY " + pkName + " ASC';");
		out.println("\t\treturn $query;");
	}

	@Override
	protected void genSQLGetTodosFk(PrintWriter out, String tblname,
			String indexStr, String pkName, String unixName, String arrElem) {
		out.println("\t\t$query = array();");
		out.println("\t\t$query['condition'] = array(" + arrElem + ");");
		if(pkName != null)
			out.println("\t\t$query['order'] = 'ORDER BY " + pkName + " ASC';");
		out.println("\t\treturn $query;");
	}

	@Override
	protected void genSQLgetCount(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\treturn Table::Count('" + tblname
				+ "'" + indexStr + ", $query['condition']);");
	}

	@Override
	protected void genSQLLimit(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\tif(!is_null($inicio) && !is_null($quantidade)) {");
		out.println("\t\t\t$query['size'] = $quantidade;");
		out.println("\t\t\t$query['offset'] = $inicio;");
		out.println("\t\t}");
		out.println("\t\t$_" + unixName + "s = DB::LimitQuery('" + tblname
				+ "'" + indexStr + ", $query);");
	}

}
