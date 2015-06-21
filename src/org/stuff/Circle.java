package org.stuff;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * Circle class
 * 
 * @author Adminas
 *
 */
// Testing coponent annotation in Spring
@Component
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
	// @Autowired
	// @Qualifier("circleRelated")

	// Now I'm testing another annotation which is Resource
	@Resource(name = "pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * This is a method which is being called after the initialization of a bean
	 */
	@PostConstruct
	public void initialieCircle() {
		System.out.println("PostConstruct: Initialize circle");
	}

	/**
	 * This is a method which is being called before destroying a bean
	 */
	@PreDestroy
	public void destroyCircle() {
		System.out.println("PreDestroy: Destroy circle");
	}
}
