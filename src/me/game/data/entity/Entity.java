package me.game.data.entity;

import me.game.Game;
import me.game.data.BoundingBox;

import javax.swing.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public abstract class Entity {

    private BoundingBox boundingBox;

    private int x;
    private int y;

    private int WIDTH = 32, HEIGHT = 64;

    public Entity() {
        addEntityToList();
        boundingBox = new BoundingBox(this.getX(), this.getY(), WIDTH, HEIGHT);

    }

    public void addEntityToList() {
        Game.getGame().gameData.addEntity(this);
    }

    public abstract JPanel entityPanel();

    public void init() {
        this.x = entityPanel().getX();
        this.y = entityPanel().getY();
        updateBounds();
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPositions(int x, int y) {
        this.x = x;
        this.y = y;
        updateBounds();
    }

    private void updateBounds() {
        this.boundingBox.setRectangle(getX(), getY(), WIDTH, HEIGHT);
        this.entityPanel().setBounds(getX(), getY(), this.entityPanel().getWidth(), this.entityPanel().getHeight());
    }

    public boolean checkCollision(Entity entity) {
        if (this.getBoundingBox().isOver(entity)) {
            return true;
        }
        return false;
    }
    public void whatOnCollision() {}
}
