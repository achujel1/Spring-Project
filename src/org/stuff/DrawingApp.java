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
	private static void testingMessageSource() throws BeansException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Shape shapeCircle = (Shape) context.getBean("circle");
		shapeCircle.drawPoint();
	}

	/**
	 * Testing message source to get text from property files
	 * 
	 * @throws BeansException
	 */
	private static void testingComponentAnnotation() throws BeansException {
		testingMessageSource();
	}

	/**
	 * Testing how JSR annotations work in Spring
	 * 
	 * @throws BeansException
	 */
	private static void testingJsrAnnotations() throws BeansException {
		// Testing resource and other annotations

		// Here I'm using AbstractApplicationContext (not ApplicationContext) so
		// I could call registerShutDownHook() method to destroy the beans
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		// Calling a method which is going to destroy the beans
		context.registerShutdownHook();
		Shape shapeCircle = (Shape) context.getBean("resourceCircle");
		shapeCircle.drawPoint();
	}

	/**
	 * Tested how auto wire annotation works
	 * 
	 * @throws BeansException
	 */
	private static void workingWIthRequiredAnnotation() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Shape shapeCircle = (Shape) context.getBean("circle");
		shapeCircle.drawPoint();
	}

	/**
	 * Testing how required annotations are working in spring
	 * 
	 * @throws BeansException
	 */
	private static void testingRequiredAnnotation() throws BeansException {
		workingWIthRequiredAnnotation();
	}

	/**
	 * Testing how interfaces are working in spring
	 * 
	 * @throws BeansException
	 */
	private static void testingInterfacesInSpring() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		// Testing triangle interface
		Shape shapeTriangle = (Shape) context.getBean("triangleInterface");
		shapeTriangle.drawPoint();
		// Testing circle interface
		Shape shapeCircle = (Shape) context.getBean("circle");
		shapeCircle.drawPoint();
	}

	/**
	 * Tested how Bean Factory Processor works
	 * 
	 * @throws BeansException
	 */
	private static void testingBeanFactoryProcessor() throws BeansException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context
				.getBean("triangleBeanPostProcessor");
		triangle.drawPoint();
	}

	/**
	 * Just tested how Bean Post Processor works
	 * 
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
		testingBeanFactoryProcessor();
		testingRequiredAnnotation();
		workingWIthRequiredAnnotation();
		testingJsrAnnotations();
		testingComponentAnnotation();
		testingMessageSource();
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
