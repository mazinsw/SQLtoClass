package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.CodeGenerator;
import code.TemplateLoader;
import util.Configuration;

public class TestDespluralize {

	@Test
	public void testPtBrWords() {
		Configuration config = new Configuration();
		config.setDictionary("oes|aes/3/ao;is/2/l/4;res|ses/2/;es|as|os|ds/1/;ns/2/m");
		config.setOutputPath("/");
		TemplateLoader templateLoader = new TemplateLoader(config);
		assertEquals("Teste", templateLoader.despluralize("Testes"));
		assertEquals("Configuracao", templateLoader.despluralize("Configuracoes"));
		assertEquals("Mesa", templateLoader.despluralize("Mesas"));
		assertEquals("Prato", templateLoader.despluralize("Pratos"));
		assertEquals("Bom", templateLoader.despluralize("Bons"));
		assertEquals("Pais", templateLoader.despluralize("Paises"));
		assertEquals("Canal", templateLoader.despluralize("Canais"));
		assertEquals("Pao", templateLoader.despluralize("Paes"));
		assertEquals("Download", templateLoader.despluralize("Downloads"));
	}

	@Test
	public void testEnUsWords() {
		Configuration config = new Configuration();
		config.setDictionary("ies/3/y;s/1/");
		config.setOutputPath("/");
		TemplateLoader templateLoader = new TemplateLoader(config);
		assertEquals("Company", templateLoader.despluralize("Companies"));
		assertEquals("User", templateLoader.despluralize("Users"));
		assertEquals("Card", templateLoader.despluralize("Cards"));
	}
}
