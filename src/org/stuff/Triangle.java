package org.stuff;

/**
 * Triangle class
 * 
 * @author Adminas
 *
 */
public class Triangle {

	/**
	 * These are just three values of triangle
	 */
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	private String type;
	private int height;

	public int getHeight() {
		return height;
	}

	/**
	 * Constructor with two arguments
	 *
	 * @param type
	 * @param height
	 */
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	/**
	 * Constructor with one argument
	 *
	 * @param type
	 */
	public Triangle(String type) {
		this.type = type;
	}

	/**
	 * Constructor with one argument
	 *
	 * @param height
	 */
	public Triangle(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	// Commenting a setter to show that constructor with argument is working
	// public void setType(String type) {
	// this.type = type;
	// }

	/**
	 * Method which is drawing a triangle
	 */
	public void draw() {
		System.out.println(getType() + " triangle drawn with height "
				+ getHeight());
	}

	/**
	 * This works only if there are no constructors. Why?
	 */
	public void drawPoint() {
		System.out.println("A: (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("B: (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("C: (" + pointC.getX() + ", " + pointC.getY() + ")");

	}

}
