package me.game.data.entity.player;

import me.game.data.entity.Entity;
import me.game.data.entity.EntityMovementManager;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class Player extends Entity {

    private EntityMovementManager playerMovementManager;

    private JPanel panel;

    public Player() {
        super("Marksman");
        playerMovementManager = new EntityMovementManager(this);
    }

    @Override
    public void addEntityToList() {
    }

    @Override
    public JPanel entityPanel() {
        this.panel.setOpaque(false);
        this.panel.setLayout(new BorderLayout());

        JLabel jLabel = new JLabel(getIcon());
        this.panel.add(jLabel, BorderLayout.CENTER);
        return this.panel;
    }

    public ImageIcon getIcon() {
        URL imgURL = getClass().getResource("/assets/sprites/characters/" + name + ".png");
        if (imgURL != null) {
            return new ImageIcon(imgURL, "");
        } else {
            System.err.println("Couldn't find file: " + "/assets/sprites/characters/" + name + ".png");
            return null;
        }
    }

    public void setPanel(JPanel entityPanel) {
        this.panel = entityPanel;
        init();
    }

    @Override
    public String getName() {
        return "Player";
    }

    public void onCollision(Entity entity) {
        System.out.println(entity.getName());
    }

    public EntityMovementManager getPlayerMovementManager() {
        return playerMovementManager;
    }
}
