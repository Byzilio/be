package com.byzilio.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.Loader;
import com.byzilio.helper.shapes.Rectangle;

public class Block extends AObject{
	
	public final int SIZE = 32;
	TextureRegion texture;
	
	public Block(int i,int j,Loader loader){
		this.shape = new Rectangle(i*SIZE, j*SIZE, SIZE, SIZE);
		this.properties.add("Block");
		texture = new TextureRegion(loader.load("block.jpg"),0,0,32,32);
	}
	
	@Override
	public void update(be game) {
		
	}

	@Override
	public void draw(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(texture,x,y,SIZE*scale,SIZE*scale);
	}

	@Override
	public void collision(AObject cObject) {
		
	}

	@Override
	public void dispose() {
		
	}
		

	public String toString(){
		return "Block "+shape.x+" "+shape.y+" "+shape.getName();
	}


}
