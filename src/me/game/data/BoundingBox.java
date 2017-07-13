package me.game.data;

import me.game.data.entity.Entity;

import java.awt.*;
import java.util.Arrays;

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
        BoundingBox boundingBox = entity.getBoundingBox();
        double eMinX = boundingBox.getRectangle().getMinX();
        double eMinY = boundingBox.getRectangle().getMinY();
        double minX = getRectangle().getMinX();
        double minY = getRectangle().getMinY();
        if (minX == eMinX && minY + 32 == eMinY)
            return true;

        return false;
    }

    public void info(Object... a) {
        System.out.println(Arrays.toString(a));
    }
}
