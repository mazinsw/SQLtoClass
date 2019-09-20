package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.CodeGenerator;

public class TestCodeGenerator {

	@Test
	public void testCapture() {
		assertEquals("all", CodeGenerator.capture("each\\(([^\\)]+)\\)", "each(all)", 1));
		assertEquals("", CodeGenerator.capture("each\\(([^\\)]+)\\)", "each", 1));
		assertEquals("", CodeGenerator.capture("each\\(([^\\)]+)\\)", "each()", 1));
	}

}
