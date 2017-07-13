package me.game.data;

import me.game.Game;
import me.game.data.entity.Entity;
import me.game.data.entity.EntityMovementManager;
import me.game.data.entity.player.Player;

import java.awt.event.KeyEvent;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class GameKeyManager {

    private EntityMovementManager playerMovement;

    public GameKeyManager() {
        this.playerMovement = Game.getGame().gameData.getPlayer().getPlayerMovementManager();
    }

    public void onKeyPressed(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_A:
                this.playerMovement.handleLeftMovement();
                checkForCollision();
                break;
            case KeyEvent.VK_W:
                this.playerMovement.handleUpMovement();
                checkForCollision();
                break;
            case KeyEvent.VK_S:
                this.playerMovement.handleDownMovement();
                checkForCollision();
                break;
            case KeyEvent.VK_D:
                this.playerMovement.handleRightMovement();
                checkForCollision();
                break;
        }
    }

    public void checkForCollision() {
        Player player = Game.getGame().gameData.getPlayer();
        for (Entity entity : Game.getGame().gameData.getAllEntitys()) {
            if (player.checkCollision(entity))
                player.onCollision(entity);
        }
    }
}
