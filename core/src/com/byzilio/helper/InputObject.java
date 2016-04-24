package com.byzilio.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.shapes.InputPoint;

public class InputObject extends AObject {

	
	public int pointer;
	public int button;
	
	public InputObject(int x,int y,int ox,int oy,int pointer,int button){
		this.shape = new InputPoint(x,y,ox,oy);
		this.pointer = pointer;
		this.button = button;
		this.properties.add("Input");
		Gdx.app.log("InputObject "+this.pointer, "x = "+ this.shape.x + " y = "+ this.shape.y);
	}
	
	
	@Override
	public void update(be game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(SpriteBatch batch, int x, int y, float scale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collision(AObject cObject) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}
