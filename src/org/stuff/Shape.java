package org.stuff;

import org.springframework.context.ApplicationEventPublisher;

/**
 * Interface Shape
 * 
 * @author Adminas
 *
 */
public interface Shape {

	/**
	 * Method which is drawing the point
	 */
	public void drawPoint();

	void setApplicationEventPublisher(ApplicationEventPublisher publisher);

}
