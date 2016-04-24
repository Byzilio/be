package com.byzilio;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.byzilio.helper.InputObject;
import com.byzilio.helper.shapes.InputPoint;

public class InputListener implements InputProcessor{

	public be game;
	
	public InputListener(be game){
		this.game = game;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("InputListener", "touchDown x="+screenX+" y="+(Gdx.graphics.getHeight()-screenY)+" p="+pointer+" b="+button);
		game.level.objects.add(new InputObject((int)(screenX/game.camera.scale)+game.camera.x,(int)((Gdx.graphics.getHeight()-screenY)/game.camera.scale)+game.camera.y,(int)(screenX/game.camera.scale),(int)((Gdx.graphics.getHeight()-screenY)/game.camera.scale),pointer,button));
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("InputListener", "touchUp x="+screenX+" y="+screenY+" p="+pointer+" b="+button);
		List<AObject> io = game.level.getObjectsWithProperties("Input");
		for(int i = 0;i < io.size();i++){
			InputObject ob =  (InputObject) io.get(i);
			if(ob.pointer == pointer) game.level.objects.remove(io.get(i));
		}
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		List<AObject> io = game.level.getObjectsWithProperties("Input");
		for(int i = 0;i < io.size();i++){
			InputObject ob =  (InputObject) io.get(i);
			if(ob.pointer == pointer) {
				InputPoint inputPoint = (InputPoint) io.get(i).getShape();
				inputPoint.x = (int)(screenX/game.camera.scale)+game.camera.x;
				inputPoint.y = (int)((Gdx.graphics.getHeight()-screenY)/game.camera.scale)+game.camera.y;
				inputPoint.ox = (int)(screenX/game.camera.scale);
				inputPoint.oy = (int)((Gdx.graphics.getHeight()-screenY)/game.camera.scale);
			}
		}return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
