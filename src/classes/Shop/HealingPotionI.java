package classes.Shop;

import classes.Kits.Kit;

import java.util.List;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class HealingPotionI extends ShopItem {


    @Override
    public int cost() {
        return 100;
    }

    @Override
    public void effect(Kit kit) {
        kit.heal(50);
    }

    @Override
    public List<String> kits() {
        List<String> kits = allKits();
        return kits;
    }

    @Override
    public String name() {
        return "Healing Potion I";
    }
}
