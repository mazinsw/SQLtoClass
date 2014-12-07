package code;

import java.io.PrintWriter;

import ast.ScriptNode;

public class PHPGeneratorDB extends PHPGeneratorBase {

	public PHPGeneratorDB(String outDir, ScriptNode script) {
		super(outDir, script);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void genSQLGet(PrintWriter out, String className, String tblname,
			String indexStr, String idName, String arrElem) {
		out.println("\t\t$condition = array(" + arrElem + ");");
		out.println("\t\tif(!is_null($ignore_id))");
		out.println("\t\t\t$condition[] = '" + idName
				+ " <> '.intval($ignore_id);");
		out.println("\t\treturn new " + className + "(DB::GetTableRow('"
				+ tblname + "'" + indexStr + ", $condition));");
	}

	@Override
	protected void genSQLGetNoID(PrintWriter out, String className,
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
	protected void genSQLInsert(PrintWriter out, String unixName,
			String idName, String tblname, String indexStr) {
		out.println("\t\t$_" + unixName + "['" + idName.toLowerCase()
				+ "'] = DB::Insert('" + tblname + "'" + indexStr + ", $_"
				+ unixName + ");");
	}

	@Override
	protected void genSQLUpdate(PrintWriter out, String tblname,
			String indexStr, String unixName, String idName) {
		out.println("\t\t$table = new Table('" + tblname + "'" + indexStr
				+ ", $_" + unixName + ");");
		out.println("\t\t$table->SetPk('" + idName.toLowerCase() + "', $_" + unixName
				+ "['" + idName.toLowerCase() + "']);");
		out.println("\t\treturn $table->Update($campos);");		
	}

	@Override
	protected void genSQLGetTodos(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\t$options = array();");
		out.println("\t\t\t$options['order'] = 'ORDER BY id ASC';");
		out.println("\t\tif(!is_null($inicio) && !is_null($quantidade)) {");
		out.println("\t\t\t$options['size'] = $quantidade;");
		out.println("\t\t\t$options['offset'] = $inicio;");
		out.println("\t\t}");
		out.println("\t\t$_" + unixName + "s = DB::LimitQuery('" + tblname
				+ "'" + indexStr + ", $options);");
	}

}
