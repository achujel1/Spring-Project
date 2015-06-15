/**
 * 
 */
package org.stuff;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Adminas
 *
 */
public class DrawingApp {

	/**
	 * Main method to write tests in
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// nothing in here
	}

	/**
	 * @throws BeansException
	 */
	private static void testingBeanPostProcessor() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context
				.getBean("triangleBeanPostProcessor");
		triangle.drawPoints();
	}

	/**
	 * Tested a lifecycle callbacks in Spring
	 * 
	 * @throws BeansException
	 */
	private static void lifecycleCallbackTest() throws BeansException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangleTest");
		triangle.drawPoint();
	}

	/**
	 * Just a method to test how bean inheritance with lists work
	 * 
	 * @throws BeansException
	 */
	private static void workingWithBeanListInheritance() throws BeansException {
		// Gets the resource
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Triangle triangle = (Triangle) context.getBean("triangle3");

		triangle.drawPoints();

		// Closes the context
		((ClassPathXmlApplicationContext) context).close();
	}

	/**
	 * List of tested methods to keep in here
	 */
	private static void testedMethods() {
		testingBeanInheritance();
		workingWithBeanListInheritance();
		lifecycleCallbackTest();
		testingBeanPostProcessor();
	}

	/**
	 * Testing bean definition inheritance
	 */
	private static void testingBeanInheritance() {
		// Gets the resource
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		// Testing how this is going to work when we add inheritance
		Triangle triangle = (Triangle) context.getBean("triangle1");

		// Now testing how this is going to work with another bean
		// Triangle triangle = (Triangle) context.getBean("triangle2");

		triangle.drawPoint();

		// Closes the context
		((ClassPathXmlApplicationContext) context).close();

	}

}
