package classes.Shop;

import classes.Characters.Character;

import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public abstract class ShopItem {

    public abstract int cost();

    public abstract void effect(Character character);

    public abstract List<Character> getAvaibleCharacters();

    public abstract List<String> getAvaibleCharactersNames();

    public abstract String name();

    public abstract String type();

    public abstract int value();

}
