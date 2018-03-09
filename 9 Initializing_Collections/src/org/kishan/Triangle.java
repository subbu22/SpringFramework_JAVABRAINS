package org.kishan;

import java.util.List;

public class Triangle
{
	/*private Point pointa;
	private Point pointb;
	private Point pointc;

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
*/
	
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