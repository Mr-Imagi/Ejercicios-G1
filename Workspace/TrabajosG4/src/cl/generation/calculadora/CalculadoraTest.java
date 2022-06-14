package cl.generation.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42); //54
		
		//assertEquals(valor esperado se compara con el resultado));
		assertEquals(54, resultado);
	}
@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0,0); //54
	    
		assertEquals("no se puede dividir por cero",resultado);
		assertNotNull(resultado);	
		assertNotEquals("0", resultado);
	}
@Test
public void testSuma() {
	Calculadora calc = new Calculadora();
	int resultado = calc.suma(12, 42);
	assertNotNull(resultado);
	
	@Test 
	public void testSumaP() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);
		assertEquals(54, 60);
		}
	
}



}
