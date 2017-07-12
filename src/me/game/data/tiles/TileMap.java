package me.game.data.tiles;

import javax.swing.*;
import java.util.List;

/**
 * Created by michtros17 on 11.07.2017.
 */
public abstract class TileMap {

    public abstract List<Tile[]> tiles();

    public void initTilePanes(JPanel jPanel) {
        int x = 0;
        int y = 0;
        for (Tile[] tiles : tiles()) {
            for (Tile tile : tiles) {
                tile.setPos(x, y);
                jPanel.add(tile.getTilePanel());
                x++;
            }
            x = 0;
            y++;
        }
    }

}
