package org.kishan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
	public static void main(String args[])
	{
		System.out.println("Start of Main method");
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();
		System.out.println("Exit from main method");
	}
}