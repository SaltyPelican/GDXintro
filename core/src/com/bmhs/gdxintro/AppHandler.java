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

	int[][] worldIntArray = {	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 2, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 2, 2, 2, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1}};

	@Override
	public void create() {
		batch = new SpriteBatch();

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
