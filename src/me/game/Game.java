package me.game;

import me.game.data.GameData;
import me.game.gui.Main_Menu;

/**
 * Created by michtros17 on 10.07.2017.
 */
public class Game {

    public GameData gameData;
    public Main_Menu main_menu;

    private static Game game;

    public static Game getGame() {
        return game;
    }

    public Game(){
        game = this;
    }


    public void startGame(){
        main_menu = new Main_Menu();
        gameData = new GameData();
    }

}
