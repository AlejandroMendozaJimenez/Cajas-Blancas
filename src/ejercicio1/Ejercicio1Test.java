package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@DisplayName("Prueba numero 1")
	@Test
	
	void prueba1() {
		//assertTrue(condicion);    // demuestra si algo es cierto
		
		//assertFalse(condicion);   //demuestra si algo es falso
		
		//assertEquals(expected, actual);  //demuestra si son iguales
		
		//assertThrows(nombre de la excepcion.class, ()->{
		//lineas que provoquen excepcion
		//});  //demuestra si hay una excepcion
		
		
		
	}
	
	@DisplayName("Recibe un cadena y una letra, prueba1")
	@Test
	void prueba01() {
		assertEquals(new Ejercicio1().contar("0000", 'a'),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba2")
	@Test
	void prueba02() {
		assertEquals(new Ejercicio1().contar("jfhfhdnchh", 'h'),4);
	}
	@DisplayName("Recibe un cadena y una letra, prueba3")
	@Test
	void prueba03() {
		assertEquals(new Ejercicio1().contar("hhhhhh", 'a'),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba4")
	@Test
	void prueba04() {
		assertEquals(new Ejercicio1().contar("", 'i'),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba5")
	@Test
	void prueba05() {
		assertEquals(new Ejercicio1().contar("ndw7nwe", ' '),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba6")
	@Test
	void prueba06() {
		assertEquals(new Ejercicio1().contar("", ' '),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba7")
	@Test
	void prueba07() {
		assertEquals(new Ejercicio1().contar("aaaa", 'a'),4);
	}
	@DisplayName("Recibe un cadena y una letra, prueba8")
	@Test
	void prueba08() {
		assertEquals(new Ejercicio1().contar("    ", ' '),4);
	}
	@DisplayName("Recibe un cadena y una letra, prueba9")
	@Test
	void prueba09() {
		assertEquals(new Ejercicio1().contar("12334", '3'),2);
	}
	@DisplayName("Recibe un cadena y una letra, prueba10")
	@Test
	void prueba010() {
		assertEquals(new Ejercicio1().contar("a", 'b'),0);
	}
	@DisplayName("Recibe un cadena y una letra, prueba11")
	@Test
	void prueba011() {
		assertEquals(new Ejercicio1().contar("b", 'b'),1);
	}
	@DisplayName("Recibe un cadena y una letra, prueba12")
	@Test
	void prueba012() {
		assertThrows(NullPointerException.class, () ->{
			new Ejercicio1().contar(null, 'b');
		});
	}
	
	

}
