package me.game.data;

import me.game.data.entity.Entity;

import java.awt.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class BoundingBox {

    private Rectangle rectangle;
    private Entity entity;

    public BoundingBox(Rectangle rectangle, Entity entity) {
        this.rectangle = rectangle;
        this.entity = entity;
    }

    public Entity onTriggerEnter(BoundingBox box) {
        if (box.getRectangle().intersects(this.rectangle))
            return this.entity;
        return null;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
