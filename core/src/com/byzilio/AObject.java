package com.byzilio;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.byzilio.helper.Shape;

public abstract class AObject {
	
	public Shape shape;
	
	public List<String> properties = new ArrayList<String>();
	
	public abstract void update(be game);
	public abstract void draw(SpriteBatch batch,int x,int y,float scale);
	public abstract void collision(AObject cObject);
	public abstract void dispose();
	

	public boolean checkProperties(String checkableProperty) {
		for (String property:properties)
			if(property == checkableProperty) return true;
		return false;
	}
	
	public boolean checkProperties(List<String> properties) {
		for (String checkableProperty:properties){
			if(checkProperties(checkableProperty)==false) return false;
		}
		return true;
	}
	
	public int getX(){
		return shape.getX();
	}
	
	public int getY(){
		return shape.getY();
	}
	
	
	public Shape getShape(){
		return shape;
	}
	
	
	
	public List<String> getPropertys(){
		return properties;
	}
	
	public String toString(){
		return "null "+shape.x+" "+shape.y+" "+shape.getName();
	}
	
}
