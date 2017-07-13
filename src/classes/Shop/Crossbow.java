package classes.Shop;

import classes.Characters.Character;
import classes.Characters.Marksman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class Crossbow extends ShopItem{

    @Override
    public int cost() {
        return 1000;
    }

    @Override
    public void effect(Character character) {
        character.addAttack(new classes.Attacks.Crossbow());
    }

    @Override
    public List<String> getAvaibleCharactersNames() {
        List<String> kits = new ArrayList<>();
        kits.add("Marksman");
        return kits;
    }

    @Override
    public List<Character> getAvaibleCharacters() {
        List<Character> kits = new ArrayList<>();
        kits.add(new Marksman());
        return kits;
    }

    @Override
    public String name() {
        return "Crossbow";
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
