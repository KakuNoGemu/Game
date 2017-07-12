package classes.Shop;

import classes.Kits.Kit;

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
    public void effect(Kit kit) {
        kit.heal(200);
    }

    @Override
    public List<String> kits() {
        List<String> kits = allKits();
        return kits;
    }

    @Override
    public String name() {
        return "Healing Potion III";
    }
}
