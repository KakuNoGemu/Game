package me.game.data.entity;

import me.game.data.BoundingBox;

import javax.swing.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public abstract class Entity {

    public abstract JPanel entityPanel();

    public abstract BoundingBox boundingBox();

}
