package org.kishan;

public class Triangle implements Shape{
	private Point pointa;
	private Point pointb;
	private Point pointc;
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
public void draw()
{
	System.out.println("Point A : "+pointa.getX() +","+pointa.getY());
	System.out.println("Point B : "+pointb.getX() +","+pointb.getY());
	System.out.println("Point C : "+pointc.getX() +","+pointc.getY());
	System.out.println("Draw Triangle");
}

}
