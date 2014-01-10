package nopattern.shape;


/**
 * Forma de esfera
 * @author dmolina
 *
 */
public class Sphere implements AcceptShape {
	int x, y, radio;

	public Sphere(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	public boolean inside(int newX, int newY) {
		if (Math.abs(x-newX) <= radio &&
			Math.abs(y-newY) <= radio) {
			return true;
		}
		else 
			return false;
	}

}
