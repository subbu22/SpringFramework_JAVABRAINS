package org.kishan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	/*@Autowired
	@Qualifier("Circlerelated")*/
	public void setCenter(Point center) {
		this.center = center;
	}
	


	public void draw() 
	{
		System.out.println("Circle Draw Method");
		System.out.println("CiclePoint : " +center.getX() + "," + center.getY());
	}
	
}
 