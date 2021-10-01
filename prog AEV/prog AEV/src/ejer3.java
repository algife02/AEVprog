import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		
		int num;
		int sum = 0;
		int par = 0;
		
		System.out.println("introduce numero: ");
		num = numero.nextInt();
		
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
		       par = par + 1;
		       sum = sum + i;
		    }
			
			
		}
		
		System.out.println("resultado: " + sum); 
	}
	

}
