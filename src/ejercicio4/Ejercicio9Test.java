package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejercicio1.Ejercicio1;

class Ejercicio9Test {

	@DisplayName("Recibe un numero positivo")
	@Test
	void prueba01() {
		assertEquals(4321, new Ejercicio9().invertir(1234));
		assertEquals(new Ejercicio9().invertir(1), 1);
		assertEquals(new Ejercicio9().invertir(1111), 1111);
	}
	@DisplayName("Recibe un numero negativo")
	@Test
	void prueba02() {
		assertEquals( new Ejercicio9().invertir(-1234), 0);
		assertEquals(new Ejercicio9().invertir(-1), 0);
		assertEquals(new Ejercicio9().invertir(-1111), 0);
	}

}
