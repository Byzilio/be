package com.byzilio.levels;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.byzilio.ALevel;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.Loader;
import com.byzilio.objects.TestButton;

public class TestLevel extends ALevel{

	Loader loader;
	
	public TestLevel(){
		Gdx.app.log("TestLevel", "create");
		loader = new Loader();
		objects = new ArrayList<AObject>();
		//objects.add(new Player(0,0,100,200,loader,this));
		objects.add(new TestButton(300,200,100,100,loader));
	}
	
	@Override
	public void update(be game) {
		//Gdx.app.log("TestLevel", "update");
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(game);
		}
	}

	@Override
	public void collision() {
		for(int i=0;i<objects.size();i++){
			for(int j=0;j<objects.size();j++){
				if ((i!=j) && (objects.get(i).shape.collision(objects.get(j).shape)==true) ) 
					objects.get(i).collision(objects.get(j));
			}
		}
	}

}
