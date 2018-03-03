package org.kishan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{
	private Point center;

	public Point getCenter() {
		return center;
	}
	@Resource(name="PointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw()
	{
		System.out.println("Circle Drawing");
		System.out.println("Circle : "+center.getX() + "," + center.getY());
	}
	/*@PostConstruct
	public void initialise()
	{
		System.out.println("Init of circle");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy of circle");
	}*/
}
