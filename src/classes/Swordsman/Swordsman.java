package classes.Swordsman;

import classes.Attack;
import classes.Kit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Swordsman extends Kit {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 100;
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
}