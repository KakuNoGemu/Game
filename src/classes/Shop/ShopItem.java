package classes.Shop;

import classes.Kits.Kit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public abstract class ShopItem {

    public abstract int cost();

    public abstract void effect(Kit kit);

    public abstract List<String> kits();

    public abstract String name();

    public abstract String type();

    public abstract int value();


    public List<String> allKits() {

        List<String> kits = new ArrayList<>();
        kits.add("Mage");
        kits.add("Marksman");
        kits.add("Swordsman");
        return kits;

    }


}
