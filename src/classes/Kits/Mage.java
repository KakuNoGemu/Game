package classes.Kits;

import java.util.ArrayList;
import java.util.List;

import classes.Attacks.Attack;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Mage extends Kit {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 120;
    }


    /**
     * @return attacks of the kit
     */
    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new classes.Attacks.Fireball());
        return attacks;
    }
}
