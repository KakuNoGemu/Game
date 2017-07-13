package me.game.data.tiles;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by michtros17 on 11.07.2017.
 */
public abstract class Tile {

    private JPanel tilePanel = new JPanel();

    private int x, y;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String getName();

    public ImageIcon getTileIcon() {
        URL imgURL = getClass().getResource("/assets/sprites/tiles/" + getName() + ".png");
        if (imgURL != null) {
            return new ImageIcon(imgURL, "");
        } else {
            System.err.println("Couldn't find file: " + "/assets/sprites/tiles/" + getName() + ".png");
            return null;
        }
    }

    public JPanel getTilePanel() {
        this.tilePanel.setLayout(new BorderLayout());

        this.tilePanel.setBounds(x * 32, y * 32, 32, 32);
        JLabel iconLabel = new JLabel(getTileIcon());
        this.tilePanel.add(iconLabel, BorderLayout.CENTER);
        return tilePanel;
    }
}
