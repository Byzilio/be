package com.byzilio.objects.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.shapes.Rectangle;

public class Button extends AObject{

	private TextureRegion sprite;
	public boolean click;
	int x;
	int y;
	int width;
	int height;
	
	public Button(int x,int y,int width,int height, TextureRegion sprite){
		shape = new Rectangle(x,y,width,height);
		this.sprite = sprite; 
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.click = false;
	}
	
	@Override
	public void update(be game) {
		shape.x = this.x + game.camera.x;
		shape.y = this.y + game.camera.y;
	}

	@Override
	public void draw(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(sprite, x, y, width*scale, height*scale);
	}
	
	@Override
	public void collision(AObject cObject) {
		if (cObject.checkProperties("Input")) {
			Gdx.app.log("Button " + sprite.toString(), "Click");
			click = true;
			return;
		}
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isClick(){
		return click;
	}
	
	public String toString(){
		return "Button "+shape.x+" "+shape.y+" "+shape.getName();
	}
	
}
