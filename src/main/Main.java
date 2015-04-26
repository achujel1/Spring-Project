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
		Drawing drawing = new Drawing();
		Triangle myTriangle = new Triangle();
		drawing.setShape(myTriangle);
		drawing.drawShape();

	}
}
