
package test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import parser.TemplateLexer;
import parser.TemplateParser;

public class TestTemplateParser {

	@Test
	public void testSimpleInput() throws IOException {
		String source = 
		        "<html>\n" +
		        "    <span>keyword</span>\n" + 
		        "$[Table.if(comment)]\n" +
		        "    <span>$.table</span>\n" + 
		        "$[table.name]\n" +
		        "    $[field.name]\n" +
		        "$[table.end]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	// @Test
	public void testInputFile() throws IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream("sample_input.php"), StandardCharsets.UTF_8);
		CharStream stream = CharStreams.fromReader(reader);
		TemplateLexer lexer = new TemplateLexer(stream);
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}
}
