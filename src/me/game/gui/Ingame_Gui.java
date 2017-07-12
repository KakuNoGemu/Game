package me.game.gui;

import me.game.data.GameKeyManager;
import me.game.generator.MapGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class Ingame_Gui extends JFrame{

    private final JPanel mainPanel = new JPanel();

    private GameKeyManager gameKeyManager;

    public Ingame_Gui(){
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(50,50,646,669);
        this.setResizable(false);


        initComponenets();

        this.setContentPane(this.mainPanel);
    }

    private void initComponenets(){
        this.mainPanel.setLayout(null);

        this.gameKeyManager = new GameKeyManager();
        this.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                gameKeyManager.onKeyPressed(e.getKeyCode());
            }
        });


        MapGenerator mapGenerator = new MapGenerator("Level_2");
        mapGenerator.loadMap().initTilePanes(this.mainPanel);
        this.mainPanel.setBackground(Color.decode("#165900"));
    }


}
