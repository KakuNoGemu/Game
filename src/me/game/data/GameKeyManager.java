package me.game.data;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class GameKeyManager {

    private PlayerMovementManager playerMovement;

    public GameKeyManager(JPanel player) {
        this.playerMovement = new PlayerMovementManager(player,0,0,1200,650);
    }

    public void onKeyPressed(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_A:
                System.out.println("LEFT");
                this.playerMovement.handleLeftMovement();
                break;
            case KeyEvent.VK_W:
                System.out.println("UP");
                this.playerMovement.handleUpMovement();
                break;
            case KeyEvent.VK_S:
                System.out.println("DOWN");
                this.playerMovement.handleDownMovement();
                break;
            case KeyEvent.VK_D:
                System.out.println("RIGHT");
                this.playerMovement.handleRightMovement();
                break;
        }
    }
}
