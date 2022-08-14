
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
	public void testFieldElseIfInput() throws IOException {
		String source = 
		        "$[field.if(comment)]\n" +
		        "    $[table.name]\n" +
		        "$[field.else.if(comment)]\n" +
		        "    $[field.name]\n" +
		        "$[field.end]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	@Test
	public void testFieldElseExistsInput() throws IOException {
		String source = 
		        "$[field.exists(comment|string)]\n" +
		        "    $[table.name]\n" +
		        "$[field.else.exists(enum)]\n" +
		        "    $[field.name]\n" +
		        "$[field.end]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	@Test
	public void testFieldElseMatchInput() throws IOException {
		String source = 
		        "$[field.if(comment)]\n" +
		        "    $[table.name]\n" +
		        "$[field.else.match(.*table|.*field.*)]\n" +
		        "    $[field.name]\n" +
		        "$[field.end]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	@Test
	public void testUniqueElseIfInput() throws IOException {
		String source = 
		        "$[unique.if(comment)]\n" +
		        "    $[table.name]\n" +
		        "$[unique.else.if(comment)]\n" +
		        "    $[table.name]\n" +
		        "$[unique.end]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	@Test
	public void testTextOnly() throws IOException {
		String source = 
		        "$a = 4;\n" +
		        "a[0];\n" +
		        "\\$[TESTE]\n";
		InputStream stream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8));
	    TemplateLexer lexer = new TemplateLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}

	@Test
	public void testInputFile() throws IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream("sample_input.php"), StandardCharsets.UTF_8);
		CharStream stream = CharStreams.fromReader(reader);
		TemplateLexer lexer = new TemplateLexer(stream);
	    TemplateParser parser = new TemplateParser(new CommonTokenStream(lexer));
	    ParseTree root = parser.template();
        System.out.println(root.toStringTree(parser));
	}
}
