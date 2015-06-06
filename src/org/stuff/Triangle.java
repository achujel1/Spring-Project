package org.stuff;

/**
 * Triangle class
 * 
 * @author Adminas
 *
 */
public class Triangle {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Method which is drawing a triangle
	 */
	public void draw() {
		System.out.println(getType() + " triangle drawn");
	}

}
