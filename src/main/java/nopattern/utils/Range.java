package nopattern.utils;

public class Range {
	int min;
	int max;
	
	public Range(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getDomain() {
		return max-min;
	}
	
	public int getMin() {
		return min;
	}
	
	public boolean isInside(int value) {
		return (value >= min && value <= max); 
	}
}
