package me.game.data;

import me.game.data.entity.Entity;

import java.awt.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class BoundingBox {

    private Rectangle rectangle;

    public BoundingBox(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public BoundingBox(int x, int y, int width, int height) {
        this(new Rectangle(x, y, width, height));
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void setRectangle(int x, int y, int width, int height) {
        setRectangle(new Rectangle(x, y, width, height));
    }

    public boolean isOver(Entity entity) {
        if (entity.getBoundingBox().getRectangle().intersects(this.rectangle))
            return true;
        return false;
    }
}
