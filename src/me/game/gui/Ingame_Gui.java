package me.game.gui;

import me.game.data.GameKeyManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class Ingame_Gui extends JFrame{

    private final JPanel mainPanel = new JPanel();
    JPanel jPanel = new JPanel();

    private GameKeyManager gameKeyManager;

    public Ingame_Gui(){
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(50,50,1280,720);
        this.setResizable(false);


        initComponenets();

        this.setContentPane(this.mainPanel);
    }

    private void initComponenets(){
        this.mainPanel.setLayout(null);

        this.jPanel.setBounds(50,50,50,50);
        jPanel.setBackground(Color.ORANGE);


        this.mainPanel.add(jPanel);

        this.gameKeyManager = new GameKeyManager(jPanel);
        this.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                gameKeyManager.onKeyPressed(e.getKeyCode());
            }
        });

    }


}
