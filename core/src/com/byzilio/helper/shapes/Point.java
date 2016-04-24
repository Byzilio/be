package com.byzilio.helper.shapes;

import com.badlogic.gdx.Gdx;
import com.byzilio.helper.Shape;

public class Point extends Shape{
	

	public Point(int x,int y){
		this.x = x;
		this.y = y;
		this.name = "Point";
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
	
	public void a(){
		Gdx.app.log("Point", "a");
	}
}
