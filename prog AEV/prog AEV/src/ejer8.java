import java.util.Iterator;
import java.util.Scanner;

public class ejer8 {
	
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1= 0;
		int num2= 0;
		
		System.out.print("Introduce el primer numero: ");
		num1=teclado.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2=teclado.nextInt();
		
		long tiempo = 0;
		
		for (int i = num1; i <= num2; i++) {
			
			long startime= System.currentTimeMillis();
			if(esPrimo(i)) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i + " no es primo");
			}
			tiempo += (System.currentTimeMillis()-startime);
		}
		System.out.println("tiempo total: " + tiempo);
		
		teclado.close();
	}

}
