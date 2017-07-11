package classes.Mage;

import classes.Attack;
import classes.Kit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Mage extends Kit {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 70;
    }


    /**
     * @return attacks of the kita
     */
    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new Fireball());
        return attacks;
    }
}
