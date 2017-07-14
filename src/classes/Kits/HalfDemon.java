package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.Curse;
import classes.Shop.ShopItem;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class HalfDemon extends Kit {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 180;
    }

    /**
     * @return attacks of the kit
     */
    @Override
    public List<Attack> attackList() {

        attacks.add(new Curse());
        return attacks;
    }

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "HalfDemon";
    }

    @Override
    public List<ShopItem> availableItems() {
        List<ShopItem> availableItems = new ArrayList<>();
        availableItems.add(new classes.Shop.HealingPotionI());
        availableItems.add(new classes.Shop.HealingPotionII());
        availableItems.add(new classes.Shop.HealingPotionIII());
        availableItems.add(new classes.Shop.FireImpact());
        return availableItems;
    }
}

