package me.game.data;

import javax.swing.*;
import java.awt.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class PlayerMovementManager {

    private JPanel player;

    private int factor = 50;

    private int curX, curY;

    private int minX, maxX, minY, maxY;

    public PlayerMovementManager(JPanel player, int minX, int minY, int maxX, int maxY) {
        this.player = player;
        this.curX = player.getX();
        this.curY = player.getY();
        this.maxX = maxX;
        this.minX = minX;
        this.maxY = maxY;
        this.minY = minY;
    }

    public void handleLeftMovement() {
        this.curX -= factor;
        updatePosition();
    }

    public void handleRightMovement() {
        this.curX += factor;
        updatePosition();
    }

    public void handleUpMovement() {
        this.curY -= factor;
        updatePosition();
    }

    public void handleDownMovement() {
        this.curY += factor;
        updatePosition();
    }

    private void updatePosition() {
        if (this.curX < this.minX)
            this.curX = this.minX;
        if (this.curX > this.maxX)
            this.curX = this.maxX;
        if (this.curY < this.minY)
            this.curY = this.minY;
        if (this.curY > this.maxY)
            this.curY = this.maxY;


        this.player.setBounds(this.curX, this.curY, 50, 50);
    }
}
