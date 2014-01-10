package nopattern.draw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import nopattern.shape.AcceptShape;
import nopattern.shape.DetectShape;
import nopattern.shape.Sphere;
import nopattern.utils.Point;
import nopattern.utils.Range;

public class DrawShape {
	private Range range;
	private int numPoints;
	
	public DrawShape(Range range, int points) {
		this.range = range;
		this.numPoints = points;
	}

	public void draw(AcceptShape accepted, String fileOutput) throws IOException {
		BufferedImage bufferedImage = new BufferedImage(range.getDomain(),range.getDomain(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = bufferedImage.createGraphics();
		DetectShape detect = new DetectShape(range, range);
		List<Point> points;

		g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING,   RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setPaint(Color.green);
		
		points = detect.detect(numPoints, accepted);
		
		for (Point p : points) {
			g2d.fillOval(p.getX(), p.getY(), 5, 5);
		}
		
		g2d.dispose();
		
		if (!fileOutput.endsWith(".png")) {
			fileOutput += ".png";
		}
		ImageIO.write(bufferedImage, "png", new File(fileOutput));
	}
	
	public void drawShpere(int x, int y, int radio, String fileOutput) throws IOException {
		draw(new Sphere(x, y, radio), fileOutput);
	}
}
