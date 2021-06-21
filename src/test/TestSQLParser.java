package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parser.SQLLexer;
import parser.SQLParser;

public class TestSQLParser {

	@Test
	public void testSimpleInput() throws IOException {
		String source = 
		        "CREATE TABLE aaa (\n" + 
		        "   field1 int,\n" + 
		        "   field1 BOOL\n" + 
		        ");\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    SQLLexer lexer = new SQLLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    SQLParser parser = new SQLParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.script();
        System.out.println(root.toStringTree(parser));
	}
}
