package main;

import utils.SetOrderedNumbers;

/**
 * Esta clase permite trabajar con números que son simultáneamente
 * divisible por dos divisores.
 * @author dmolina
 *
 */
public class UtilDivisores {
	int div1, div2;

	/**
	 * Constructor
	 * @param div1 primer divisor
	 * @param div2 segundo divisor
	 */
	UtilDivisores(int div1, int div2) {
		this.div1 = div1;
		this.div2 = div2;
	}

	/**
	 * Permite obtener listado de números divisibles por ambos divisores (de 1 a max)
	 * @param max número máximo
	 * @return listado de elementos no repetidos
	 */
	private SetOrderedNumbers getDivisores(int max) {
		SetOrderedNumbers numbers = new SetOrderedNumbers();
		
		for (int i=1; i <= max; i++) {
			if ((i % div1)==0) {
				numbers.add(i);
			}
			else if ((i % div2)==0) {
				numbers.add(i);
			}
		}
		
		return numbers;
	}
		
	public double suma(int max) {
		SetOrderedNumbers numbers = getDivisores(max);
		double sum = 0;
	
		for (Double elem : numbers) {
			sum += elem.doubleValue();
		}
		
		return sum;
	}

	public double multiplica(int max) {
		SetOrderedNumbers numbers = getDivisores(max);
		double sum = 1;
	
		for (Double elem : numbers) {
			sum *= elem.doubleValue();
		}
		
		return sum;
	}
	
	
	public 
	
}
