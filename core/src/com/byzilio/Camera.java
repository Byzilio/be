package com.byzilio;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Camera {
	
	public int x,y;
	public SpriteBatch batch;
	public float scale;
	
	public Camera(){
		batch = new SpriteBatch();
		scale = 1.0f;
		x = 0;
		y = 0;
	}
	
	public Camera(int x,int y){
		batch = new SpriteBatch();
		scale = 1.0f;
		this.x = x;
		this.y = y;
	}
	public Camera(int x,int y,float scale){
		batch = new SpriteBatch();
		this.scale = scale;
		this.x = x;
		this.y = y;
	}
	
	public void render(List<AObject> objects){
		batch.begin();
		for(int i=0;i<objects.size();i++){
			objects.get(i).draw(batch,(int)( (objects.get(i).getX()-x)*scale),(int)( (objects.get(i).getY()-y)*scale), scale);
		}
		
		//Gdx.app.log("Camera", "render");
		batch.end();
	}
	
	public void dispose(){
		batch.dispose();
	}
}
