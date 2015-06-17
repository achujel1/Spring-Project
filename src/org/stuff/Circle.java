package org.stuff;

/**
 * Circle class
 * 
 * @author Adminas
 *
 */
public class Circle implements Shape {

	private Point center;

	/**
	 * Method to get the values of drawn circle
	 */
	@Override
	public void drawPoint() {
		System.out.println("Drawing circle:");
		System.out.println("Circle point is : (" + center.getX() + ", "
				+ center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
