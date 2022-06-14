package cl.generation.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42); //54
		
		//assertEquals(valor esperado se compara con el resultado));
		assertEquals(54, resultado);}
	
	
	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(12, 0); //54
		
		
	}

}
