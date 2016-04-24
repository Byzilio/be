package com.byzilio.helper;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Loader {

	private Map<String,Texture> textures;
	
	public Loader(){
		textures = new HashMap<String,Texture>();
	}
	
	public Texture load(String filename){
		
		Gdx.app.log("Loader", "Filename = " + filename);
		
		for(String s:textures.keySet()) {
			if (s.equals(filename)) {
				Gdx.app.log("Loader", "equals");
				return textures.get(s);
			}
		}
		
		Texture lt = new Texture(Gdx.files.internal(filename));
		textures.put(filename, lt);
		Gdx.app.log("Loader", "new Texture ( " + filename + " )");
		return lt;
	}
	
	public void dispose(){
		for(String s:textures.keySet()) {
			textures.get(s).dispose();
		}
	}
	
}
