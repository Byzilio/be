package com.byzilio;

import java.util.ArrayList;
import java.util.List;

public abstract class ALevel {
	
	public List<AObject> objects;
	
	public abstract void update(be be);
	public abstract void collision();
	
	public List<AObject> getAllObjects(){
		return objects;
	}
	
	public List<AObject> getObjectsWithProperties(List<String> properties){
		List<AObject> withProperty = new ArrayList<AObject>();
		for (AObject object:objects){
			if (object.checkProperties(properties)) withProperty.add(object); 
		}
		return withProperty;
	}
	
	public List<AObject> getObjectsWithProperties(String property){
		List<AObject> withProperty = new ArrayList<AObject>();
		for (AObject object:objects){
			if (object.checkProperties(property)) withProperty.add(object); 
		}
		return withProperty;
	}
	
	public void dispose(){
		for(AObject object : objects){
			object.dispose();
		}
	}
	
	
}
