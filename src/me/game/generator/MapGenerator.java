package me.game.generator;

import me.game.Game;
import me.game.data.tiles.Tile;
import me.game.data.tiles.TileMap;
import me.game.data.tiles.tiles.Tile_Grass;
import me.game.data.tiles.tiles.Tile_Wall;
import me.game.data.tiles.tiles.Tile_Water;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by michtros17 on 12.07.2017.
 */
public class MapGenerator {

    private String mapName;

    private List<String> allTilesList;

    public MapGenerator(String mapName) {
        this.mapName = mapName;
        this.allTilesList = allTiles();
    }

    public TileMap loadMap() {

        List<Tile[]> tilesMap = new ArrayList<>();

        for (int i = 0; i < allTilesList.size(); i++) {
            Tile[] rowAtPos = tileRows(i);
            tilesMap.add(rowAtPos);
        }

        return new TileMap() {
            @Override
            public List<Tile[]> tiles() {
                return tilesMap;
            }
        };^
    }

    public Tile[] tileRows(int row) {
        Tile[] returnTileRow = new Tile[20];
        String curRow = allTilesList.get(row);

        int pos = 0;

        for (char c : curRow.toCharArray()) {
            switch (c) {
                case 'W':
                    returnTileRow[pos] = new Tile_Water();
                    break;
                case 'w':
                    returnTileRow[pos] = new Tile_Wall();
                    break;
                case 'G':
                    returnTileRow[pos] = new Tile_Grass();
                    break;
            }
            pos++;
        }

        return returnTileRow;
    }

    public List<String> allTiles() {
        List<String> tiles = new ArrayList<>();
        try {
            InputStream inputStream = Game.class.getResourceAsStream("/assets/maps/" + mapName + ".map");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                tiles.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tiles;
    }

}
