package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.BAttack;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Kit {

    public int health() {

        return 1000;
    }

    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new BAttack());
        return attacks;
    }

    @Override
    public int goldDrop() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return null;
    }
}
