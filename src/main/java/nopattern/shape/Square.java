package nopattern.shape;

import nopattern.utils.Range;

public class Square extends CAcceptShape {
	Range rangeX, rangeY;
	
	public Square(Range rangeX, Range rangeY) {
		this.rangeX = rangeX;
		this.rangeY = rangeY;
	}
	
	public boolean internal_inside(int x, int y) {
		return rangeX.isInside(x) && rangeY.isInside(y);
	}
}
