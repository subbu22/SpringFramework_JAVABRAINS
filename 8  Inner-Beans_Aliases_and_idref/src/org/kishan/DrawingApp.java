package org.kishan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		//without Alias
		//Triangle triangle = (Triangle) context.getBean("triangle");
		
		//with alias
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
		System.out.println("Exit from main");
	}
}