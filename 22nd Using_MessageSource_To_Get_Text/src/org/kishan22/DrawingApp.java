package org.kishan22;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring22.xml");
		Shape shape=(Shape) context.getBean("circle");
		shape.draw();
		System.out.println(context.getMessage("Greeting",null,"Default Greeting",null));
		/*
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring21.xml");
		context.registerShutdownHook();
		Shape shape=(Shape) context.getBean("Circle");
		shape.draw();*/
	}

}

