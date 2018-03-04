package org.kishan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class Circle implements Shape{
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw()
	{
		System.out.println("Circle Drawing");
		System.out.println("Circle : "+center.getX() + "," + center.getY());
	}
	
	@PostConstruct
	public void initialise()
	{
		System.out.println("Init of circle");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy of circle");
	}
}
