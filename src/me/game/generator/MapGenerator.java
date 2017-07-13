package me.game.generator;

import me.game.data.entity.Trigger;
import me.game.data.tiles.*;
import me.game.data.tiles.tiles.*;
import me.game.utils.*;

import java.io.*;
import java.util.*;

/**
 * Created by michtros17 on 12.07.2017.
 */
public class MapGenerator {

    private List<Tile> allTiles;

    private int startPosX, startPosY;

    private String mapName;

    public MapGenerator(String mapName) {
        this.mapName = mapName;
        this.allTiles = aviableTiles();
    }

    public TileMap generateMap() {
        List<Tile[]> mapTiles = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mapTiles.add(tilesAtRow(i));
        }

        TileMap tileMap = new TileMap() {
            @Override
            public List<Tile[]> tiles() {
                return mapTiles;
            }
        };
        tileMap.setStartPos(getStartPosX(), getStartPosY());

        return tileMap;
    }

    public int getStartPosX() {
        return startPosX;
    }

    public int getStartPosY() {
        return startPosY;
    }

    public Tile[] tilesAtRow(int rowID) {
        Tile[] tiles = new Tile[20];
        int id = 0;
        for (Tile tile : allTiles) {
            if (tile.getY() == rowID) {
                tiles[id] = tile;
                id++;
            }
        }
        return tiles;
    }

    public List<Tile> aviableTiles() {
        List<Tile> tiles = new ArrayList<>();

        try {
            File input = Utils.getFromStream("/assets/maps/" + this.mapName + ".csv");
            String line;
            String cvsSplitBy = ",";

            BufferedReader br = new BufferedReader(new FileReader(input));
            while ((line = br.readLine()) != null) {
                String[] curTile = line.split(cvsSplitBy);
                String name = curTile[0];
                String isSolid = curTile[3];
                int x = Integer.parseInt(curTile[1]);
                int y = Integer.parseInt(curTile[2]);
                if (name.equalsIgnoreCase("spawnpoint")) {
                    this.startPosX = x;
                    this.startPosY = y;
                } else {
                    Tile currentTile;
                    switch (name) {
                        case "water":
                            currentTile = new WaterTile();
                            break;
                        case "wall":
                            currentTile = new WallTile();
                            break;
                        case "grass":
                            currentTile = new GrassTile();
                            break;
                        default:
                            currentTile = new WallTile();
                            break;
                    }

                    boolean isSol = false;
                    switch (isSolid) {
                        case "solid":
                            isSol = true;
                            break;
                        case "nonSolid":
                            isSol = false;
                            break;
                        default:
                            isSol = false;
                            break;
                    }
                    currentTile.setPos(x, y);
                    if (isSol) {
                        Trigger trigger = new Trigger(x, y);
                        trigger.setSolide(true);
                    }
                    tiles.add(currentTile);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return tiles;
    }
}