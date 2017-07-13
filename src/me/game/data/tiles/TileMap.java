package me.game.data.tiles;

import me.game.Game;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by michtros17 on 11.07.2017.
 */
public abstract class TileMap {

    public abstract List<Tile[]> tiles();

    private int startX, startY;

    public void setStartPos(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    public void initTilePanes(JLayeredPane jPanel) {
        for (Tile[] tiles : tiles()) {
            for (Tile tile : tiles) {
                JPanel t = tile.getTilePanel();
                jPanel.add(t);
                jPanel.moveToBack(t);
            }
        }
    }

}
