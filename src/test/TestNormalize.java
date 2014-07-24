package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.CodeGenerator;

public class TestNormalize {

	@Test
	public void test() {
		assertEquals("TesteBom", CodeGenerator.normalize("TestesBons"));
		assertEquals("TesteBom", CodeGenerator.normalize("testes_bons"));
		assertEquals("Usuario", CodeGenerator.normalize("TUsuarios"));
		assertEquals("Matriz[1][2]", CodeGenerator.normalize("Matriz1_2"));
		assertEquals("Vetor[1]", CodeGenerator.normalize("Vetor1"));
		assertEquals("Ident[1].Teste", CodeGenerator.normalize("Ident1Teste"));
		assertEquals("Ident[1][2].Teste", CodeGenerator.normalize("Ident1_2_Teste"));
		assertEquals("Ident[1][2].Teste[3][4][5].Teste", CodeGenerator.normalize("Ident1_2teste_3_4_5Teste"));
		assertEquals("Ident[1][2].TesteAAaaa[3][4][5].TeBste", CodeGenerator.normalize("Ident1_2teste_a_aaaa3_4_5TeBste"));
	}

}
