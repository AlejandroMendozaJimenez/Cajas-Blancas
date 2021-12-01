package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejercicio1.Ejercicio1;

class Ejer {

	@DisplayName("R")
	@Test
	void prueba1() {
		assertEquals(new Ejercicio1().contar("0000", 'a'),0);
	}

}
