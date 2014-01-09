package nopattern.main;

import nopattern.utils.SetOrderedNumbers;

/**
 * Permite trabajar con primos.
 * No se puede modificar.
 * @author dmolina
 *
 */
public class UtilPrimos {
	
	private static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;

		  if (numero == 1) {
			  return true;
		  }

		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	// Suma 1 +  
	public static double sumaPrimos(int max) {
		SetOrderedNumbers numbers = new SetOrderedNumbers();
		double sum=0;
		
		for (int i=1; i <= max; i++) {
			if (esPrimo(i)){
				numbers.add(i);
			}
		}
		
		for (Double elem : numbers) {
			sum += elem.doubleValue();
		}
		
		return sum;
	}	
	
}
