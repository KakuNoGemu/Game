package classes.Characters;

import classes.Attacks.Attack;
import classes.Attacks.Sword;
import classes.Shop.ShopItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Swordsman extends Character {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 300;
    }


    /**
     * @return attacks of the kit
     */
    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new Sword());
        return attacks;
    }

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "Swordsman";
    }

    @Override
    public List<ShopItem> availableItems() {
        List<ShopItem> availableItems = new ArrayList<>();
        availableItems.add(new classes.Shop.HealingPotionI());
        availableItems.add(new classes.Shop.HealingPotionII());
        availableItems.add(new classes.Shop.HealingPotionIII());
        availableItems.add(new classes.Shop.IronSword());
        return availableItems;
    }
}