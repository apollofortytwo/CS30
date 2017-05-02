package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TileManager {
	Tile[][] map;
	Tile SelectedTile = null;
	int width, height;
	
	TileManager(int width, int height) {
		map = new Tile[width][height];
		this.width = width;
		this.height = height;
	}

	public void initMap() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				map[x][y] = new Tile(x * 50, y * 50);
			}
		}
	}
	
	public void renderOutline(ShapeRenderer sr){
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				map[x][y].renderOutline(sr);
			}
		}
	}
	
}
