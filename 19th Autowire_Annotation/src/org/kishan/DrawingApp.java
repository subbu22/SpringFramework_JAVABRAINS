package org.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring19.xml");
		Shape shape = (Shape) context.getBean("Circle");
		shape.draw();
	}
}
