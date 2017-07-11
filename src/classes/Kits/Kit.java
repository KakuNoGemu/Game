package classes.Kits;

import classes.Attacks.Attack;

import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Kit {

    // Health of the kit
    public abstract int health();

    //
    public abstract List<Attack> attackList();

}
