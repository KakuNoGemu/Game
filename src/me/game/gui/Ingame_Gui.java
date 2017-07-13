package me.game.gui;

import me.game.Game;
import me.game.data.GameKeyManager;
import me.game.data.entity.Trigger;
import me.game.data.tiles.TileMap;
import me.game.generator.MapGenerator;
import me.game.utils.Utils;

import javax.rmi.CORBA.Util;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class Ingame_Gui extends JFrame{

    private final JLayeredPane mainPanel = new JLayeredPane();

    private JPanel player = new JPanel();

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


        MapGenerator mapGenerator = new MapGenerator("Level_1");
        TileMap currentTileMap = mapGenerator.generateMap();
        currentTileMap.initTilePanes(this.mainPanel);

        Game.getGame().gameData.getPlayer().setPanel(this.player);
        Game.getGame().gameData.getPlayer().setPositions(mapGenerator.getStartPosX(),mapGenerator.getStartPosY());
        this.mainPanel.add(Game.getGame().gameData.getPlayer().entityPanel());
        this.mainPanel.moveToFront(Game.getGame().gameData.getPlayer().entityPanel());


        Trigger trigger = new Trigger(0,0);
        this.mainPanel.add(trigger.entityPanel());
        this.mainPanel.moveToFront(trigger.entityPanel());

        this.mainPanel.setBackground(Color.decode("#165900"));
    }


}
