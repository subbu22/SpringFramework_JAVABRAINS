package org.kishan23;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;


@Repository
public class Circle23 implements Shape23{
	private Point23 center;
	@Autowired
	private MessageSource msg;
	

	public MessageSource getMsg() {
		return msg;
	}

	public void setMsg(MessageSource msg) {
		this.msg = msg;
	}
	
	public Point23 getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point23 center) {
		this.center = center;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
		System.out.println("Circle Point from XML file: "+center.getX() + "," + center.getY());
		
		//below line gets the value from properties file
		System.out.println("Circle Point from Properties file : "+this.msg.getMessage("Drawing_Point",new Object[] {center.getX(),center.getY()},"Default Point message",null));
		System.out.println(this.msg.getMessage("greeting",null,"Default Greeting",null));
	}
	
	@PostConstruct
	public void initialise()
	{
		System.out.println("Init of circle");
	}
	/*
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy of circle");
	}*/
}
