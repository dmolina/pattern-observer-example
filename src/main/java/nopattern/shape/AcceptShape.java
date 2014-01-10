package nopattern.shape;

/**
 * Permite saber cuando un punto está centro de una figura
 * @author dmolina
 *
 */
public interface AcceptShape {
	/**
	 * Indicate when a point is inside a shape
	 * @param x value
	 * @param y value
	 * @return true if it is inside, false otherside
	 */
	boolean inside(int x, int y);
}
