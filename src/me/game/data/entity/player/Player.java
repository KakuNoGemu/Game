package me.game.data.entity.player;

import me.game.data.entity.Entity;
import me.game.data.entity.EntityMovementManager;

import javax.swing.*;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class Player extends Entity {

    private EntityMovementManager playerMovementManager;

    private JPanel panel;

    public Player(){
        playerMovementManager = new EntityMovementManager(this);
    }

    @Override
    public void addEntityToList() {}

    @Override
    public JPanel entityPanel() {
        return this.panel;
    }

    public void setPanel(JPanel entityPanel) {
        this.panel = entityPanel;
        init();
    }

    public void onCollision(Entity entity) {

    }

    public EntityMovementManager getPlayerMovementManager() {
        return playerMovementManager;
    }
}
