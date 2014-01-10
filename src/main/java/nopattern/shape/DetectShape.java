package nopattern.shape;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import nopattern.utils.Point;
import nopattern.utils.Range;

/**
 * Allow us to draw a shape using the interface AcceptShape
 * @author dmolina
 *
 */
public class DetectShape {
	Range rangeX, rangeY;
	int domainX, domainY;
	Random random;

	/**
	 * Constructor
	 * @param rangeX of domain
	 * @param rangeY of domain
	 */
	public DetectShape(Range rangeX, Range rangeY) {
		this.rangeX = rangeX;
		this.domainX = rangeX.getMax()-rangeX.getMin();
		this.rangeY = rangeY;
		this.domainY = rangeY.getMax()-rangeY.getMin();
		this.random = new Random();
	}
	
	/**
	 * Create points inside a figure creating number points, and 
	 * accepted only inside the shape
	 * @param number of points
	 * @param insideShape interface to indicate when a point is inside
	 * @return a list of points inside the shape
	 */
	public List<Point> detect(int number, AcceptShape insideShape) {
		List<Point> pointsInside = new LinkedList<Point>();
		
		for (int i = 1; i <= number; i++) {
			int x = random.nextInt(domainX+1)+rangeX.getMin();
			int y = random.nextInt(domainY+1)+rangeY.getMin();
			
			if (insideShape.inside(x, y)) {
				pointsInside.add(new Point(x, y));
			}
		}
		
		return pointsInside;
	}

}
