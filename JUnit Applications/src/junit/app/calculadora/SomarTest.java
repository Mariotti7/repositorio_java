package junit.app.calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class SomarTest {

	// Exemplo 1 de Teste
	@Test
	void testMain() { //sempre publi e void

		Somar soma = new Somar(); // instanciamento da classe Somar

		double resultadoEsperado = 10; // variavel de resultado teste

		double resultado = soma.soma(4, 6); // implementação do metodo

		assertTrue(resultado == resultadoEsperado); // metodo de comparação

	}

	// Exemplo 2 de Teste
	@Test
	void testSomar() {

		Somar soma = new Somar();

		double resultadoEsperado = -10;

		double resultado = soma.soma(-4, -6);

		assertEquals(resultadoEsperado, resultado);

	}

	// Exemplo 3 de Teste
	@Test
	void testSimples() {

		Somar soma = new Somar();

		double resultado = soma.soma(20, 20);

		assertEquals(40, resultado);

	}
	
	@Ignore //ignora o teste
	void testSimples1() {

		Somar soma = new Somar();

		double resultado = soma.soma(100, 20);

		assertEquals(40, resultado);

	}
	
}
