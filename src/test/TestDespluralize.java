package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.CodeGenerator;

public class TestDespluralize {

	@Test
	public void testWords() {
		assertEquals("Teste", CodeGenerator.despluralize("Testes"));
		assertEquals("Configuracao", CodeGenerator.despluralize("Configuracoes"));
		assertEquals("Mesa", CodeGenerator.despluralize("Mesas"));
		assertEquals("Prato", CodeGenerator.despluralize("Pratos"));
		assertEquals("Bom", CodeGenerator.despluralize("Bons"));
		assertEquals("Pais", CodeGenerator.despluralize("Paises"));
		assertEquals("Canal", CodeGenerator.despluralize("Canais"));
		assertEquals("Pao", CodeGenerator.despluralize("Paes"));
		assertEquals("Download", CodeGenerator.despluralize("Downloads"));
	}

}
