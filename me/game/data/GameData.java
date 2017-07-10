package me.game.data;

import me.game.Game;

/**
 * Created by michtros17 on 10.07.2017.
 */
public class GameData {

    private boolean isRunning = false;

    public GameData(){
        this.isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
