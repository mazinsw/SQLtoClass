package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.TemplateLoader;
import util.Configuration;

public class TestNormalize {

	@Test
	public void test() {
		TemplateLoader templateLoader = new TemplateLoader(new Configuration());
		assertEquals("TesteBom", templateLoader.normalize("TestesBons"));
		assertEquals("TesteBom", templateLoader.normalize("testes_bons"));
		assertEquals("Usuario", templateLoader.normalize("TUsuarios"));
		assertEquals("Matriz[1][2]", templateLoader.normalize("Matriz1_2"));
		assertEquals("Vetor[1]", templateLoader.normalize("Vetor1"));
		assertEquals("Ident[1].Teste", templateLoader.normalize("Ident1Teste"));
		assertEquals("Ident[1][2].Teste", templateLoader.normalize("Ident1_2_Teste"));
		assertEquals("Ident[1][2].Teste[3][4][5].Teste", templateLoader.normalize("Ident1_2teste_3_4_5Teste"));
		assertEquals("Ident[1][2].TesteAAaaa[3][4][5].TeBste", templateLoader.normalize("Ident1_2teste_a_aaaa3_4_5TeBste"));
	}

}
