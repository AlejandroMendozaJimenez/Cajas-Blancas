package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejercicio1.Ejercicio1;

class Ejercicio8Test {

	@DisplayName("Recibe un numero positivo")
	@Test
	void prueba01() {
		assertEquals(new Ejercicio8().fibo(1), 1);
		assertEquals(new Ejercicio8().fibo(2), 2);
		assertEquals(new Ejercicio8().fibo(3), 3);
	}
	@DisplayName("Recibe un numero negativo")
	@Test
	void prueba02() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Ejercicio8().fibo(-1);
		});
	}
	@DisplayName("Recibe el numero 0")
	@Test
	void prueba03() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Ejercicio8().fibo(0);
		});
	}
	
	

}
