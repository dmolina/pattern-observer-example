package utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class allow us to get a list ordered without repeat numbers
 * @author dmolina
 *
 */
public class SetOrderedNumbers implements Iterable<Double>{
	private List<Double> list;

	public SetOrderedNumbers() {
		list = new LinkedList<Double>();				
	}

	public void add(double number) {		
		if (!exist(number)) {
			Double elem = Double.valueOf(number);
			list.add(elem);
		}		
	}
	
	public boolean exist(double number) {
		Double elem = Double.valueOf(number);
		return (list.indexOf(elem)>=0);
	}

	public Iterator<Double> iterator() {
		return list.iterator();
	}
	
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		int pos=0; 
		int max = list.size();
		buffer.append("[");
		
		for (Double value : list) {
			buffer.append(value);
			pos += 1;
			
			if (pos < max) {
				buffer.append(", ");				
			}
			
		}
		
		buffer.append("]");
		return buffer.toString();
	}
}
