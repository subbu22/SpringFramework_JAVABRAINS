package org.kishan;

public class Triangle
{
	private String type;
	private int height;
	
	//Constructor doesnt take the "name tag" in xml
	public Triangle(String type) {
	this.type = type;
}
	public Triangle(int height) {
		this.height=height;
	}

	public Triangle(String type,int height) {
		this.type = type;
		this.height=height;
	}
/*	//Setter-Getter method
	public String getType() {
	return type;
}

	public void setType(String type) {
	this.type = type;
}*/

	public void draw() {
		//System.out.println(getType()+"triangle Drawn by Setter-Getter Method");
		System.out.println("triangle Drawn by Constructor : type :"+type + " " + "Height is" + " : "+height);

	}

}