package me.game.data.entity;

import javax.swing.*;
import java.awt.*;

/**
 * Created by michtros17 on 13.07.2017.
 */
public class Trigger extends Entity {

    private JPanel jPanel = new JPanel();

    public Trigger(int x, int y) {
        super();
        this.setHEIGHT(32);
        this.setWIDTH(32);
        this.jPanel.setBounds(x * 32, y * 32,32, 32);
        this.jPanel.setBackground(Color.decode("#ffffff"));
    }

    @Override
    public String getName() {
        return "Trigger";
    }

    @Override
    public JPanel entityPanel() {
        return this.jPanel;
    }

    public void onCollision(){

    }
}
