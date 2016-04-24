package com.byzilio.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.Loader;
import com.byzilio.helper.shapes.Rectangle;

public class TestButton extends AObject {

	public TextureRegion tr;
	int x;
	int y;
	int width;
	int height;
	public boolean click;
	
	public TestButton(int x,int y,int width,int height,Loader loader){
		shape = new Rectangle(x,y,width,height);
		this.x = x;
		this.y = y;
		//tr = new TextureRegion(new Texture(Gdx.files.internal("red.jpg")),0,0,100,100);
		tr = new TextureRegion(loader.load("red.jpg"),0,0,100,100);
		this.width = width;
		this.height = height;
		this.click = false;
		Gdx.app.log("dasda", "dfasd");
		this.properties.add("LOL");
	}
	
	@Override
	public void update(be game) {
		if (click) {
			game.camera.x = game.camera.x + 1;
		}
		click = false;
		Gdx.app.log("Camera", " x="+game.camera.x + " y="+ game.camera.y);
	}

	@Override
	public void draw(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(tr, this.x, this.y, width*scale, height*scale);
	}

	@Override
	public void collision(AObject cObject) {
		if (cObject.checkProperties("Input")) {
			Gdx.app.log("TestButton", "##############################################################Click");
			click = true;
		}
		if (cObject.checkProperties("LOL")) {
			Gdx.app.log("Test", "REEEEEEEEEEEEEEEEEEEEEEEEEEEEeeee");
		}
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}
