package nopattern.main;

import java.io.IOException;

import nopattern.draw.DrawShape;
import nopattern.shape.Square;
import nopattern.utils.Range;

public class Main {

	/**
	 * Ejemplo de clases
	 * @param params
	 */
	public static void main(String []params) {
		DrawShape draw = new DrawShape(new Range(0, 100), 200);
		String fileOutput1 = "esfera.png";
		String fileOutput2 = "cubo.png";
		try {
			draw.drawShpere(30,  30, 30, fileOutput1);
			Range cuboX = new Range(30, 80);
			Range cuboY = new Range(50, 80);
			draw.draw(new Square(cuboX, cuboY), fileOutput2);
		} catch (IOException e) {
			System.err.println(
					String.format("Error, no se pudo generar los ficheros"));			
		}
		
	}
	
	
}
