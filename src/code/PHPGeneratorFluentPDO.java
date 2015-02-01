package code;

import java.io.PrintWriter;

import ast.ScriptNode;


public class PHPGeneratorFluentPDO extends PHPGeneratorBase {

	public PHPGeneratorFluentPDO(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	protected void genSQLGetFromPrimaryKey(PrintWriter out, String className,
			String tblname, String indexStr, String arrElem) {
		out.println("\t\t$query = DB::$pdo->from('"
				+ tblname + "'" + indexStr + ")");
		out.println("\t\t                 ->where(array(" + arrElem + "));");
		out.println("\t\treturn new " + className + "($query->fetch());");		
	}

	@Override
	protected void genSQLDelete(PrintWriter out, String tblname,
			String indexStr, String arrElem) {
		out.println("\t\t$query = DB::$pdo->deleteFrom('" 
			+ tblname + "'" + indexStr + ")");
		out.println("\t\t                 ->where(array(" + arrElem + "));");
		out.println("\t\treturn $query->execute();");
	}

	@Override
	protected void genSQLInsert(PrintWriter out, String unixName,
			String idName, String tblname, String indexStr) {
		out.println("\t\t\t$_" + unixName + "['" + idName.toLowerCase()
				+ "'] = DB::$pdo->insertInto('" + tblname + "'" + indexStr + ")->values($_"
				+ unixName + ")->execute();");
	}

	@Override
	protected void genSQLUpdate(PrintWriter out, String tblname,
			String indexStr, String unixName, String idName) {
		out.println("\t\t\t$query = DB::$pdo->update('" + tblname + "'" + indexStr + ");");
		out.println("\t\t\t$query = $query->set(array_intersect_key($_" + unixName + ", array_flip($campos)));");
		out.println("\t\t\t$query->where('" + idName.toLowerCase() + "', $_" + unixName
				+ "['" + idName.toLowerCase() + "'])->execute();");
	}

	@Override
	protected void genSQLGetTodos(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\treturn   DB::$pdo->from('"
				+ tblname + "'" + indexStr + ")");
		out.println("\t\t                 ->orderBy('id ASC');");		
	}

	@Override
	protected void genSQLGetTodosFk(PrintWriter out, String tblname,
			String indexStr, String unixName, String arrElem) {
		out.println("\t\treturn   DB::$pdo->from('"
				+ tblname + "'" + indexStr + ")");
		out.println("\t\t                 ->where(array(" + arrElem + "))");
		out.println("\t\t                 ->orderBy('id ASC');");
	}

	@Override
	protected void genSQLgetCount(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\treturn $query->count();");
	}

	@Override
	protected void genSQLLimit(PrintWriter out, String tblname,
			String indexStr, String unixName) {
		out.println("\t\tif(!is_null($inicio) && !is_null($quantidade)) {");
		out.println("\t\t\t$query = $query->limit($quantidade)->offset($inicio);");
		out.println("\t\t}");
		out.println("\t\t$_" + unixName + "s = $query->fetchAll();");
	}

}
