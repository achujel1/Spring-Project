/**
 * 
 */
package org.stuff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adminas
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Gets the resource
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.drawPoint();

		// Closes the context
		((ClassPathXmlApplicationContext) context).close();
	}

}
