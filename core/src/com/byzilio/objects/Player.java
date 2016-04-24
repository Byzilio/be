package com.byzilio.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.Loader;
import com.byzilio.helper.shapes.Rectangle;

public class Player extends AObject {

	TextureRegion sprite;
	int width;
	int height;
	
	public Player(int x,int y,int width,int height,Loader loader){
		this.shape = new Rectangle(x,y,width,height);
		this.width = width;
		this.height = height;
		sprite = new TextureRegion(loader.load("mage.jpg"),0,0,32,64);
		this.properties.add("Object");
	}
	
	@Override
	public void update(be game) {
		shape.x += 1;
	}

	@Override
	public void draw(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(sprite,x,y,width*scale,height*scale);
	}

	@Override
	public void collision(AObject cObject) {
		if(cObject.checkProperties("Block")) Gdx.app.log("LOL", "LAL");
		Gdx.app.log("rrrrrrrr", "kjgjkfgjfgdljfgdjk");
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "Player "+shape.x+" "+shape.y+" "+shape.getName();
	}

}
