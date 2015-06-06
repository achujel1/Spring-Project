package org.stuff;

/**
 * Triangle class
 * 
 * @author Adminas
 *
 */
public class Triangle {

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

}
