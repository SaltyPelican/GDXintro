package com.bmhs.gdxintro.gfx.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.assets.WorldTile;

public class TileHandler {

    public static TileHandler tileHandler = null;

    private int spriteOnSheetHeight, spriteOnSheetWidth;

    private String primaryColorSheetPath = "primaryColorSheet.png";

    private Array<WorldTile> worldTileArray;

    //SINGLETON
    private TileHandler() {
        worldTileArray = new Array<>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);

        TextureRegion tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*2, spriteOnSheetHeight*0, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 0, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*1, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile lightGrayWorldTile = new WorldTile(tempRegion, 1, "background color: light gray");
        worldTileArray.add(lightGrayWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*1, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile grayRedWorldTile = new WorldTile(tempRegion, 2, "gray");
        worldTileArray.add(grayRedWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*2, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkgrayWorldTile = new WorldTile(tempRegion, 3, "dark gray");
        worldTileArray.add(darkgrayWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*3, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile darkGreenWorldTile = new WorldTile(tempRegion, 4, "dark green");
        worldTileArray.add(darkGreenWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*4, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile lightGreenRedWorldTile = new WorldTile(tempRegion, 5, "light green");
        worldTileArray.add(lightGreenRedWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*5, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile yellowWorldTile = new WorldTile(tempRegion, 6, "yellow");
        worldTileArray.add(yellowWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*6, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 7, "white");
        worldTileArray.add(whiteWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*7, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile orangeGreenWorldTile = new WorldTile(tempRegion, 8, "orange");
        worldTileArray.add(orangeGreenWorldTile);

        tempRegion = new TextureRegion(tempTexture, spriteOnSheetWidth*0, spriteOnSheetHeight*8, spriteOnSheetWidth, spriteOnSheetHeight);
        WorldTile redWorldTile = new WorldTile(tempRegion, 9, "red");
        worldTileArray.add(redWorldTile);
    }

    public Array<WorldTile> getWorldTileArray() {
        return worldTileArray;
    }

    public static TileHandler getTileHandler() {
        if(tileHandler == null) {
            tileHandler = new TileHandler();
        }
        return tileHandler;
    }

}
