package org.kishan;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{

	private Point center;
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
=======

public class Circle implements Shape{

	private Point center;
	public Point getCenter() {
		return center;
	}
	@Autowired
>>>>>>> refs/remotes/origin/master
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println("Circle Drawn");	
		System.out.println("Circle center : "+center.getX() +","+center.getY());
	}
	

}