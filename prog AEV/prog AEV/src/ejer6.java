import java.util.Scanner;

public class ejer6 {

	public class NumArray {
	
	public static void main(String[] args) {
		
		int num[] = new int[5];
		int suma= 0;
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
        	
        	System.out.print("Introduce un n?mero: ");
            num[i]=numero.nextInt(); 
            suma +=num[i];
        }
        System.out.println("Imprimiendo orden inverso.");
        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.println("Indice  " + i + " =" + num[i]);
        	}
        
        
        System.out.println("Suma de los numeros: " + suma);
	}
	}
}
