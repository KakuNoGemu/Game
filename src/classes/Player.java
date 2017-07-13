package classes;

import classes.Characters.Character;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class Player {

    public Character player;
    private int experience = 0;
    private int maxExperience = 100;
    private int level = 0;
    private int gold = 0;
    //private double healthMax = player.healthMax;
    private List<String> availableKits = new ArrayList<String>() {
        {
            add("Mage");
            add("Marksman");
            add("Swordsman");
        }
    };


    public void chooseKit(String kit) {

        if (availableKits.contains(kit)) {
            if (kit == "Mage") {
                player = new classes.Characters.Mage();
            } else if (kit == "Marksman") {
                player = new classes.Characters.Marksman();
            } else if (kit == "Swordsman") {
                player = new classes.Characters.Swordsman();
            }
        }
    }


    private void levelUp() {
        level += 1;
        //healthMax += 10;
        experience -= maxExperience;
        maxExperience += 10;
        gold += 20;
    }

    public void kill(Character character) {
        character.killed();
        experience += 10;
        if (experience >= maxExperience) {
            levelUp();
        }
        gold += character.goldDrop();
    }


}
