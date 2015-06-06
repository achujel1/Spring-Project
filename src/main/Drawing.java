package main;

/**
 * This is a Drawing class
 * 
 * @author Adminas
 *
 */
public class Drawing {

	private Shape shape;

	/**
	 * This is a setter for shape
	 * 
	 * @param shape
	 *            object from class Shape
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * This is a method which is drawing
	 * 
	 */
	public void drawShape() {
		this.shape.draw();
	}
}
