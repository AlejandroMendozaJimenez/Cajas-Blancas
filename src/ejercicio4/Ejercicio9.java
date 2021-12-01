package ejercicio4;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(invertir(2345));

	}
	
	public static int invertir(int numero) {
		int resto=0;
		int invertido=0;
		
		while(numero>0){
			resto=numero%10;
			invertido=invertido*10+resto;
			numero/=10;
		}
		
		return invertido;
		
	}

}
