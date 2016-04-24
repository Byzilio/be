package com.byzilio;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.byzilio.levels.PTLevel;

public class be extends Game{
	public ALevel level;
	public Camera camera;
	InputListener input;
	
	@Override
	public void create () {
		Gdx.app.log("Game", "create");
		level = new PTLevel();
		camera = new Camera(1000,1000,1.0f);
		input = new InputListener(this);
		Gdx.input.setInputProcessor(input);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//Gdx.app.log("Game", "render");
		level.update(this);
		level.collision();
		camera.render(level.getAllObjects());
	}
	

	@Override
	public void dispose () {
		level.dispose();
		camera.dispose();
	}
}
