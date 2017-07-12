package classes.Kits;

import classes.Attacks.Arrow;
import classes.Attacks.Attack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Marksman extends Kit {


    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 200;
    }

    /**
     * @return attacks of the kit
     */
    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new Arrow());
        return attacks;
    }

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "Marksman";
    }

}
