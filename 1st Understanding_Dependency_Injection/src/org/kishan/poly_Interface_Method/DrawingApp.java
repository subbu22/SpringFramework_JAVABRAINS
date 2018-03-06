package org.kishan.poly_Interface_Method;

public class DrawingApp{
	public static void main(String args[]){
	Shape shape = new Circle();
	DrawMthod(shape);
	
	Shape shape1 = new Triangle();
	DrawMthod(shape1);
	
}

	public static void DrawMthod(Shape shape) {
	shape.draw();
	
}
	
	//Still they are not free from instantiation still we create instance of Circle and Triangle
}
