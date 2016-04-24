package com.byzilio.helper.shapes;

import com.badlogic.gdx.Gdx;
import com.byzilio.helper.Shape;

public class InputPoint extends Shape{
	
	public int ox;
	public int oy;
	
	
	public InputPoint(int x,int y,int ox,int oy){
		this.x = x;
		this.y = y;
		this.ox = ox;
		this.oy = oy;
		this.name = "InputPoint";
	}
	
	public boolean collision(Shape shape){
		if (shape.getName().equals("Point")){
			Point point = (Point) shape;
			if ((point.getX() == this.getX()) && (point.getY() == this.getY())){
				return true;
			}
		}
		if (shape.getName().equals("Rectangle")){
			Rectangle rectangle = (Rectangle) shape;
			if ( (this.x >= rectangle.x) && (this.x<=rectangle.x+rectangle.width) && (this.y >= rectangle.y) && (this.y<=rectangle.y+rectangle.height)  ){
				return true;
			}
		}
		
		
		return false;	
	}
	
}
