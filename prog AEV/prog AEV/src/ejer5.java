
public class ejer5 {

	public static void main(String[] args) {
		
		int[] listaNumeros = new int[] { 4 , 20, 8, 3, 9, 1};
		
		int mayor = 0; 
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > mayor) {
				mayor = listaNumeros[i];
			}
		
		}
		
		System.out.println("el mayor: " + mayor);

	}

}
