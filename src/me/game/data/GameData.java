package me.game.data;

import me.game.Game;
import me.game.data.entity.Entity;
import me.game.data.entity.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michtros17 on 10.07.2017.
 */
public class GameData {

    private List<Entity> allEntitys = new ArrayList<>();

    private boolean isRunning = false;

    public GameData() {
        this.isRunning = true;
        this.player = new Player();
    }

    public void addEntity(Entity entity) {
        this.allEntitys.add(entity);
    }

    public List<Entity> getAllEntitys() {
        return allEntitys;
    }

    public boolean isRunning() {
        return isRunning;
    }

    private Player player;

    public Player getPlayer() {
        return player;
    }
}
