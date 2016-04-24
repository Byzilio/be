package com.byzilio.helper;

public abstract class Shape {
	public int x;
	public int y;
	public String name;
	
	public abstract boolean collision(Shape shape);
	
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getName(){
		return name;
	}
}
