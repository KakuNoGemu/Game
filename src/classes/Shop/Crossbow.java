package classes.Shop;

import classes.Kits.Kit;

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
    public void effect(Kit kit) {
        kit.addAttack(new classes.Attacks.Crossbow());
    }

    @Override
    public List<String> kits() {
        List<String> kits = new ArrayList<>();
        kits.add("Marksman");
        return kits;
    }

    @Override
    public String name() {
        return "Crossbow";
    }

}
