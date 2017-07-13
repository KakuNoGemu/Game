package classes.Shop;

import classes.Characters.Character;
import classes.Characters.CharacterManager;

import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class HealingPotionIII extends ShopItem {

    @Override
    public int cost() {
        return 300;
    }

    @Override
    public void effect(Character character) {
        character.heal(200);
    }

    @Override
    public List<String> getAvaibleCharactersNames() {
        List<String> kits = CharacterManager.getPlayerKitsNames();
        return kits;
    }

    @Override
    public List<Character> getAvaibleCharacters() {
        List<Character> kits = CharacterManager.getPlayerKits();
        return kits;
    }

    @Override
    public String name() {
        return "Healing Potion III";
    }

    @Override
    public String type() {
        return "healing";
    }

    @Override
    public int value() {
        return 200;
    }
}
