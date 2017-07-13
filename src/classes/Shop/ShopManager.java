package classes.Shop;

import classes.Characters.Character;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 13.07.2017.
 */
public class ShopManager {

    public static List<ShopItem> getShopItems() {

        List<ShopItem> shopItems = new ArrayList<>();
        shopItems.add(new Crossbow());
        shopItems.add(new IronSword());
        shopItems.add(new FireImpact());
        shopItems.add(new HealingPotionI());
        shopItems.add(new HealingPotionII());
        shopItems.add(new HealingPotionIII());

        return shopItems;
    }

    public static List<String> getShopItemsNames() {

        List<String> availableCharacters = new ArrayList<String>();
        for (ShopItem shopItem : getShopItems()) {
            availableCharacters.add(shopItem.name());
        }

        return availableCharacters;

    }

}
