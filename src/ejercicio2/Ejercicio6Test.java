package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejercicio1.Ejercicio1;

class Ejercicio6Test {

	@DisplayName("Recibe el numero 0")
	@Test
	void prueba01() {
		assertFalse(new Ejercicio6().esPrimo(0));
	}
	@DisplayName("Recibe el numero 1")
	@Test
	void prueba02() {
		assertTrue(new Ejercicio6().esPrimo(1));
	}
	@DisplayName("Recibe el numero 7")
	@Test
	void prueba03() {
		assertTrue(new Ejercicio6().esPrimo(7));
	}
	@DisplayName("Recibe el numero 563")
	@Test
	void prueba04() {
		assertTrue(new Ejercicio6().esPrimo(563));
	}
	@DisplayName("Recibe el numero 6")
	@Test
	void prueba05() {
		assertFalse(new Ejercicio6().esPrimo(6));
	}
	@DisplayName("Recibe el numero no primo")
	@Test
	void prueba06() {
		assertFalse(new Ejercicio6().esPrimo(564));
	}
	@DisplayName("Recibe el numero negativo")
	@Test
	void prueba07() {//habria que cambiar el codigo
		assertTrue(new Ejercicio6().esPrimo(-5)); 
		assertTrue(new Ejercicio6().esPrimo(-563));
	}
	
	
	

}
