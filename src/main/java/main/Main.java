package main;

public class Main {

	/**
	 * Ejemplo de clases
	 * @param params
	 */
	public static void main(String []params) {
		UtilDivisores utilDivisores = new UtilDivisores(3, 5);
		int max = 10; 
	
		System.out.println(UtilPrimos.sumaPrimos(max));
		System.out.println(utilDivisores.suma(max));
		// Quiero poder saber la media de valores añadidos a la lista, no siempre		
		// Quiero poder imprimir cada elemento insertado, no siempre
	}
	
	
}
