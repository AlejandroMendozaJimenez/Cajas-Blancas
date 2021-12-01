package ejercicio3;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		
		
		
		System.out.println(new Ejercicio8().fibo(-1));
		
	
		}
	
	
	
	public int fibo(int numero) {
		
		int n1=0;
		int n2=1;
		
		int suma=0;
		
		for (int i = 0; i < numero; i++) {
			suma=n1+n2;
			n1=n2;
			n2=suma;
			
			
		}
		
		
		
		
		return suma;
		
		
	}

	public void fibo2() {
		
		for (int i = 0; i < 30; i++) {
			

			System.out.println(fibo(i));
		}
		
	}
	
}
