package main;

/**
 * This is the Main class of this project
 * 
 * @author Adminas
 *
 */
public class Main {

	/**
	 * Main method
	 * 
	 * @param args
	 *            the arguments you pass to console
	 */
	public static void main(String[] args) {
		Drawing drawingTriangle = new Drawing();
		Triangle myTriangle = new Triangle();
		drawingTriangle.setShape(myTriangle);
		drawingTriangle.drawShape();

		Drawing drawingCircle = new Drawing();
		Circle myCircle = new Circle();
		drawingCircle.setShape(myCircle);
		drawingCircle.drawShape();
	}
}
