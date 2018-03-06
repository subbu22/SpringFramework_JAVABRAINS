package org.kishan23;

import org.springframework.context.ApplicationEvent;


public class DrawEvent extends ApplicationEvent {
	public DrawEvent(Object source) {
		super(source);
	}
	public String toString() {
		return "Draw Event of Circle Occured";
	}

}
