package org.kishan.poly_Interface;

public class DrawingApp 
{
	public static void main(String args[])
	{
		Shape shape=new Triangle();
		shape.draw();
		
		Shape shape1=new Circle();
		shape1.draw();
	}
//Still the object are tied with each other So we dont extract any use of polymorphism
}
