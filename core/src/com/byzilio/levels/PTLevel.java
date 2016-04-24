package com.byzilio.levels;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.byzilio.ALevel;
import com.byzilio.AObject;
import com.byzilio.be;
import com.byzilio.helper.Loader;
import com.byzilio.objects.Block;
import com.byzilio.objects.Player;
import com.byzilio.objects.TestButton;

public class PTLevel extends ALevel{

	Loader loader;
	AObject[][] map;
	
	
	public PTLevel(){
		loader = new Loader();
		objects = new ArrayList<AObject>();
		/*
		map = new AObject[2][2];
		map[0][0] = new Block(0,0,loader);
		objects.add(map[0][0]);
		map[0][1] = new Block(0,1,loader);
		objects.add(map[0][1]);
		map[1][0] = new Block(1,0,loader);
		objects.add(map[1][0]);
		map[1][1] = new Block(1,1,loader);
		objects.add(map[1][1]);
		objects.add(new Player(10,10,32,64,loader));
		*/
		objects.add(new TestButton(10,20,200,100,loader));
		objects.add(new TestButton(50,0,50,200,loader));
	}
	
	@Override
	public void update(be be) {
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(be);
		}
	}
	@Override
	public void collision() {
		/*List<AObject> sorted = this.getObjectsWithProperties("Object");
		for(int i = 0;i < sorted.size();i++ ){
			for(int j = 0;j < objects.size();j++){
				if (sorted.get(0)!=objects.get(0)) Gdx.app.log("asfsad", "**********************************");
				if ((sorted.get(i)!=objects.get(j)) && (sorted.get(i).shape.collision(objects.get(j).shape)==true) ) 
				{
					Gdx.app.log("asfsad", "work");
					sorted.get(i).collision(objects.get(j));
				}
			}
		}*/
		for(int i=0;i<objects.size();i++){
			for(int j=0;j<objects.size();j++){
				if ((i!=j) && (objects.get(i).shape.collision(objects.get(j).shape)==true) ) 
					objects.get(i).collision(objects.get(j));
			}
		}
	}

	public void dispose(){
		loader.dispose();
	}
}
