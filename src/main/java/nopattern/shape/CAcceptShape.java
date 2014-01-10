package nopattern.shape;

public abstract class CAcceptShape implements AcceptShape {

	public boolean inside(int x, int y) {
		return internal_inside(x, y);
	}
	
	abstract boolean internal_inside(int x, int y); 
}
