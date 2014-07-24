package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.CodeGenerator;

public class TestUnixName {

	@Test
	public void test() {
		assertEquals("teste_bom", CodeGenerator.unixTransform("TesteBom"));
		assertEquals("tteste_bbom", CodeGenerator.unixTransform("TTesteBBom"));
		assertEquals("bom", CodeGenerator.unixTransform("Bom"));
		assertEquals("bbom", CodeGenerator.unixTransform("BBom"));
	}

}
