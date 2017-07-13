package classes.Shop;

import classes.Characters.Character;
import classes.Characters.Marksman;
import classes.Characters.Swordsman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class IronSword extends ShopItem {


    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public void effect(Character character) {
        character.addAttack(new classes.Attacks.IronSword());
    }

    @Override
    public List<String> getAvaibleCharactersNames() {
        List<String> kits = new ArrayList<>();
        kits.add("Swordsman");
        return kits;
    }

    @Override
    public List<Character> getAvaibleCharacters() {
        List<Character> kits = new ArrayList<>();
        kits.add(new Swordsman());
        return kits;
    }

    @Override
    public String name() {
        return "Iron Sword";
    }

    @Override
    public String type() {
        return "weapon";
    }

    @Override
    public int value() {
        return 30;
    }
}
