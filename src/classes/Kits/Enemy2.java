package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.EAttack;

import java.util.ArrayList;
import java.util.List;

public class Enemy2 extends Kit {

    public int health() {

        return 120;
    }

    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new EAttack());
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


