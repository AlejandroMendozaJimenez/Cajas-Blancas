package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		System.out.println(new Ejercicio1().contar("hahyiola", 'h'));
		

	}
	
	public int contar( String cadena, char letra) {
		int contador=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==letra)contador ++;
		}
		return contador;
	}

}
