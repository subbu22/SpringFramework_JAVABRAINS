package org.kishan;


import java.util.List;

import org.springframework.context.ApplicationContext;

/*public class Triangle implements ApplicationContextAware, BeanNameAware
*/
public class Triangle
{
	/*private Point pointa;
	private Point pointb;
	private Point pointc;
	private ApplicationContext context;

	public Point getPointa() 
	{
		return pointa;
	}

	public void setPointa(Point pointa)
	{
		this.pointa = pointa;
	}

	public Point getPointb() 
	{
		return pointb;
	}


	public void setPointb(Point pointb) 
	{
		this.pointb = pointb;
	}

	public Point getPointc()
	{
		return pointc;
	}

	public void setPointc(Point pointc)
	{
		this.pointc = pointc;
	}
	
	public void draw()
	{
		System.out.println("Triangle draw");
		System.out.println(" PointA : "+"(" +pointa.getX() +","+ pointa.getY() + ")");
		System.out.println(" PointB : "+"(" +pointb.getX() +","+ pointb.getY() + ")");
		System.out.println(" PointC : "+"(" +pointc.getX() +","+ pointc.getY() + ")");
	}
*/
	/*@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
System.out.println("bean name is  : "+beanName);		
	}*/
	
	
	
private List<Point> points;
	
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw()
	{
		System.out.println("Triangle draw");
		for(Point point:points)
		{
			System.out.println(" PointA : "+"(" +point.getX() +","+ point.getY() + ")");
		}
	}
}