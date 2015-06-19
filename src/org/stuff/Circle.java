package org.stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

	// @Required
	// Instead of using required, I'm going to use auto wire
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

}
