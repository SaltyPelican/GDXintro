package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.utils.TileHandler;
import org.graalvm.compiler.loop.MathUtil;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;

	int x, y;

	int[][] worldIntArray = {	{1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 3, 4, 5, 5, 5, 4, 3, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 3, 5, 5, 5, 5, 5, 5, 5, 3, 1, 1, 1, 1, 1, 1, 1},
								{3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 5, 4, 3, 1, 1, 1, 1, 1, 1},
								{3, 5, 5, 5, 5, 5, 5, 5, 6, 6, 5, 5, 5, 3, 1, 1, 3, 3, 1, 1},
								{3, 7, 5, 5, 5, 5, 5, 6, 6, 6, 6, 5, 5, 3, 3, 3, 5, 3, 1, 1},
								{1, 3, 7, 7, 7, 5, 5, 3, 9, 7, 6, 5, 4, 3, 5, 3, 5, 3, 3, 3},
								{1, 1, 3, 7, 7, 7, 7, 3, 9, 7, 5, 5, 3, 3, 5, 5, 5, 3, 5, 3},
								{1, 1, 1, 3, 3, 7, 7, 7, 7, 7, 7, 3, 3, 3, 5, 5, 5, 5, 5, 3},
								{1, 1, 1, 1, 1, 3, 3, 8, 8, 4, 6, 6, 3, 3, 3, 6, 5, 5, 4, 3},
								{1, 1, 1, 1, 3, 5, 3, 7, 8, 6, 4, 8, 6, 3, 3, 6, 5, 4, 3, 1},
								{1, 1, 1, 1, 3, 3, 7, 7, 3, 5, 4, 3, 3, 3, 6, 4, 3, 3, 1, 1},
								{1, 1, 1, 1, 1, 3, 7, 7, 3, 3, 5, 5, 5, 5, 5, 3, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 3, 8, 7, 7, 5, 5, 5, 5, 5, 3, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 3, 8, 3, 8, 5, 5, 4, 3, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 3, 3, 1, 3, 8, 3, 3, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}};



	// int[][] worldIntArray = new int[17][20];

	@Override
	public void create() {
		batch = new SpriteBatch();

		/**
		 * setRandomArray();
		 */
		/*
			pick a random [r][c] in Array and drop one pixel
			search out that pixel. and r + 1, r, r-1 ... change their color
		 */
		x = 0;
		y = 0;
	}

	private void setRandomArray() {
		for(int r = 0; r < worldIntArray.length; r++){
			for(int c = 0; c < worldIntArray[r].length; c++)
				worldIntArray[r][c] = MathUtils.random(4);
		}
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < worldIntArray.length; r++){
			for(int c = 0; c < worldIntArray[r].length; c++){
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray[r][c]).getTexture(), c* Tile.ON_SCREEN_DEFAULT_WIDTH, Gdx.graphics.getHeight() - Tile.ON_SCREEN_DEFAULT_HEIGHT - (r*Tile.ON_SCREEN_DEFAULT_HEIGHT));
			}
		}
		/*
		for(int r = 0; r < Gdx.graphics.getHeight(); r+=64){
			for(int c = 0; c < Gdx.graphics.getWidth(); c+= 64){
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(x++).getTexture(), c, r);
				if(x > 4){
					x = 0;
				}
			}

		 */


		// int u = 64;

		/*
		batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(0).getTexture(), 0, 0);
		batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(1).getTexture(), 64, 0);
		batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(2).getTexture(), 0, 64);
		batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(3).getTexture(), 64, 64);
		batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(4).getTexture(), 128, 0);


		 */
		batch.end();

		checkInput();
	}

	public void checkInput() {
		/*
		if(Gdx.input.isKeyJustPressed(Input.Keys.W)) {
			y += 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.S)) {
			y -= 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.D)) {
			x += 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			x -= 10;
		}

		 */

		System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());

		/*
		x = Gdx.input.getX();
		y = Gdx.graphics.getHeight() - Gdx.input.getY();
		 */

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
