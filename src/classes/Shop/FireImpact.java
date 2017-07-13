package classes.Shop;

import classes.Characters.Character;
import classes.Characters.Mage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class FireImpact extends ShopItem {

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public void effect(Character character) {
        character.addAttack(new classes.Attacks.FireImpact());
    }

    @Override
    public List<String> getAvaibleCharactersNames() {
        List<String> kits = new ArrayList<>();
        kits.add("Mage");
        return kits;
    }

    @Override
    public List<Character> getAvaibleCharacters() {
        List<Character> kits = new ArrayList<>();
        kits.add(new Mage());
        return kits;
    }

    @Override
    public String name() {
        return "Fire Impact";
    }

    @Override
    public String type() {
        return "weapon";
    }

    @Override
    public int value() {
        return 40;
    }
}
