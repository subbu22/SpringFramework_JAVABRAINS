package org.kishan23;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp23 {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring23.xml");
		Shape23 shape=(Shape23) context.getBean("circle23");
		shape.draw();
		
	}

}

