package org.stuff;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * Circle class
 * 
 * @author Adminas
 *
 */
// Testing coponent annotation in Spring
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	// Object to work with event handling
	private ApplicationEventPublisher publisher;

	// Creating and object to get the text from properties file
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * Method to get the values of drawn circle
	 */
	@Override
	public void drawPoint() {
		// Changing printing of the point
		/*
		 * System.out.println("Drawing circle:");
		 * System.out.println("Circle point is : (" + center.getX() + ", " +
		 * center.getY() + ")");
		 */
		System.out.print(messageSource.getMessage("drawing.circle", null,
				"Drawing random circle", null));
		System.out.println(messageSource.getMessage("drawing.point",
				new Object[] { center.getX(), center.getY() },
				"Drawing random point", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
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

	/**
	 * Method which is setting the publisher
	 */
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
