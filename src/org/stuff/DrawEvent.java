package org.stuff;

import org.springframework.context.ApplicationEvent;

/**
 * Class to test how event handling is working in Spring
 * 
 * @author Adminas
 *
 */
public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "Draw event occured";
	}
	
}
