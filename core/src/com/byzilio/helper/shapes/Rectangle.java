package com.byzilio.helper.shapes;

import com.badlogic.gdx.Gdx;
import com.byzilio.helper.Shape;

public class Rectangle extends Shape{

	public int width;
	public int height;
	
	public Rectangle(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.name = "Rectangle";
	}
	
	@Override
	public boolean collision(Shape shape) {
		if (shape.getName().equals("Point")){
			Point point = (Point) shape;
			if ( (point.x >= this.x) && (point.x<=this.x+this.width) && (point.y >= this.y) && (point.y<=this.y+this.height)   ){
				return true;
			}
		}
		if (shape.getName().equals("InputPoint")){
			InputPoint inputPoint = (InputPoint) shape;
			if ( (inputPoint.x >= this.x) && (inputPoint.x<=this.x+this.width) && (inputPoint.y >= this.y) && (inputPoint.y<=this.y+this.height)   ){
				return true;
			}
			if ( (inputPoint.ox >= this.x) && (inputPoint.ox<=this.x+this.width) && (inputPoint.oy >= this.y) && (inputPoint.oy<=this.y+this.height)   ){
				return true;
			}
		}
		
		if (shape.getName().equals("Rectangle")){
			
			Rectangle rectangle = (Rectangle) shape;
			int x1 = this.x;
			int y1 = this.y;
			int w1 = this.width;
			int h1 = this.height;
			int x2 = rectangle.x;
			int y2 = rectangle.y;
			int w2 = rectangle.width;
			int h2 = rectangle.height;
			if ( (x2 >= x1) && (x2<=x1+w1) && (y2 >= y1) && (y2<=y1+h1) ){
				return true;
			}
			if ( (x2+w2 >= x1) && (x2+w2 <=x1+w1) && (y2 >= y1) && (y2<=y1+h1) ){
				return true;
			}
			if ( (x2>= x1) && (x2<=x1+w1) && (y2+h2 >= y1) && (y2+h2<=y1+h1) ){
				return true;
			}
			if ( (x2+w2>= x1) && (x2+w2<=x1+w1) && (y2+h2 >= y1) && (y2+h2<=y1+h1) ){
				return true;
			}
			
			
			if ( (x1> x2) && (x1<x2+w2) && (y2 > y1) && (y2 < y1+h1) ){
				return true;
			}
			

			
		}
		
		return false;
	}

}
