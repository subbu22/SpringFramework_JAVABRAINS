package org.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
		Shape shape=(Shape) context.getBean("triangle");
		shape.draw();
	}
}
