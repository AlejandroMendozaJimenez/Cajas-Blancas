package ejercicio2;

public class Ejercicio6 {

	public static void main(String[] args) {

		//new Ejercicio6().descFact(40);
		System.out.println(esPrimo(-5));
	}

	public static boolean esPrimo(int numero) {
		boolean bandera = false;
		int contador = 2;
		boolean resultado = true;

		if (numero == 2) {
			bandera = true;
		}
		
		while (bandera == false) {

			if (numero % contador == 0) {
				bandera = true;
				resultado = false;

			}

			if (contador >= numero - 1) {
				bandera = true;

			}

			contador++;

		}

		return resultado;

	}

	public void mostrarPrimos() {
		for (int i = 1; i <= 10000; i++) {

			if (esPrimo(i)) {
				System.out.println("es primo: " + i);
			}

		}

	}

//	public void descFact(int numero) {
//		boolean bandera = false;
//		int contador = 2;
//
//		while (!bandera) {
//
//			if (esPrimo(contador)) {
//				if (numero % contador == 0) {
//					System.out.print(contador + " *");
//					numero = numero / contador;
//					contador = 1;
//
//				}
//
//			}
//
//			contador++;
//
//			if (numero <= 1) {
//				bandera = true;
//			}
//		}
//
//	}

}
