package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Entity {
	int x, y;
	public Entity(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void update(){
		
	}
	
	public void renderSprite(){
		//TODO
	}
	
	public void renderOutline(ShapeRenderer sr){
		sr.rect(x + 12, y + 12, 25, 25);
	}
}
