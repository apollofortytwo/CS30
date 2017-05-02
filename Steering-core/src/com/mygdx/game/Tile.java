package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Tile {
	int x, y;

	Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update(){
		
	}
	
	public void renderSprite(){
		//TODO
	}
	
	public void renderOutline(ShapeRenderer sr){
		sr.rect(x, y, 50, 50);
	}
}
