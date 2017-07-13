package classes.Characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lukafaus17 on 13.07.2017.
 */
public class CharacterManager {

    public static List<Character> getAllKits() {
        List<Character> allCharacters = new ArrayList<Character>();
        allCharacters.add(new Mage());
        allCharacters.add(new Marksman());
        allCharacters.add(new Swordsman());
        allCharacters.add(new Enemy1());

        return allCharacters;
    }

    public static List<Character> getPlayerKits() {

        List<Character> availableCharacters = new ArrayList<Character>();
        availableCharacters.add(new Mage());
        availableCharacters.add(new Marksman());
        availableCharacters.add(new Swordsman());

        return availableCharacters;

    }

    public static List<String> getPlayerKitsNames() {

        List<String> availableCharacters = new ArrayList<String>();
        for (Character character : getAllKits()) {
            availableCharacters.add(character.name());
        }

        return availableCharacters;

    }

    public static HashMap<String, Character> getAllKitsHashMap() {
        HashMap<String, Character> allCharacters = new HashMap<String, Character>();
        allCharacters.put("Mage", new Mage());
        allCharacters.put("Marksman", new Marksman());
        allCharacters.put("Swordsman", new Swordsman());
        allCharacters.put("Enemy", new Enemy1());

        return allCharacters;
    }

}
