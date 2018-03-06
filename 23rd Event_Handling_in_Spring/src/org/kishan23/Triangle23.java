package org.kishan23;

import org.kishan23.Point23;
import org.kishan23.Shape23;

public class Triangle23 implements Shape23{
private Point23 pointa;
private Point23 pointb;
private Point23 pointc;
public Point23 getPointa() {
	return pointa;
}
public void setPointa(Point23 pointa) {
	this.pointa = pointa;

}
public Point23 getPointb() {
	return pointb;
}
public void setPointb(Point23 pointb) {
	this.pointb = pointb;
}
public Point23 getPointc() {
	return pointc;
}
public void setPointc(Point23 pointc) {
	this.pointc = pointc;
}

public void draw()
{
	System.out.println("Triangle drawn");
	System.out.println("Point A : "+pointa.getX() + " " + pointa.getY());
	System.out.println("Point B : "+pointb.getX() + " " + pointb.getY());
	System.out.println("Point C : "+pointc.getX() + " " + pointc.getY());

}
}
