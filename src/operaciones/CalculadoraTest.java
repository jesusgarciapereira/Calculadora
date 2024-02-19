package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(3, 5);
		int result = calc.suma();
		assertEquals(8, result);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(10, 5);
		int result = calc.resta();
		assertEquals(5, result);
	}

	@Test
	void testResta2True() {
		Calculadora calc = new Calculadora (5,4);
		boolean resultado = calc.resta2();
		assertTrue(resultado);
	}
	
	@Test
	void testResta2False() {
		Calculadora calc = new Calculadora (4,5);
		boolean resultado = calc.resta2();
		assertFalse(resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(3, 6);
		int result = calc.multiplica();
		assertEquals(18, result);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20, 2);
		int result = calc.divide();
		assertEquals(10, result);
	}
	
	@Test
	void testDivide2SegundoNum0() {
		Calculadora calc = new Calculadora(20, 0);
		Integer result = calc.divide2();
		assertNull(result);
	}
	
	@Test
	void testDivide2SegundoNumNo0() {
		Calculadora calc = new Calculadora(20, 4);
		Integer result = calc.divide2();
		assertNotNull(result);
	}

}
