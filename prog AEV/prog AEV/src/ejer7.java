import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int numero;
		
		System.out.print("introduce tu nombre ");
		nombre=teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		numero=teclado.nextInt();
		
		if(numero <= 1) {
			System.out.println("el trabajador " + nombre + " cobra entre 15000-18000 euros" );
		} else if (numero >= 1 && numero <= 2) {
			System.out.println("el trabajador " + nombre + " cobra entre 18000-22000? euros" );
		} else if (numero >= 3 && numero <= 5) {
			System.out.println("el trabajador " + nombre + " cobra entre 22000-28000 euros" );
		} else if (numero >= 5 && numero <= 8) {
			System.out.println("el trabajador " + nombre + " cobra entre 28000-36000 euros" );
		}else{
			System.out.println("el trabajador " + nombre + " tiene Salario a convenir en base a rol" );
		}
		teclado.close();
		
	}

}
