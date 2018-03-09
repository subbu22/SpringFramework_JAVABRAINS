package org.kishan;

public class Triangle
{
	private String type;
	
	//Constructor doesnt take the "name tag" in xml
	public Triangle(String type) {
	this.type = type;
}

	//Setter-Getter method
	public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

	public void draw() {
		System.out.println(getType()+"trinagle Drawn");
	}

}