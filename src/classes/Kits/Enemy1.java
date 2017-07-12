package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.EAttack;

import java.util.ArrayList;
import java.util.List;

public class Enemy1 extends Kit {

    public int health() {

        return 100;
    }

    @Override
    public List<Attack> attackList() {
        List<Attack> attacks = new ArrayList<>();

        attacks.add(new EAttack());
        return attacks;
    }

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "Enemy";
    }

	@Override
	public int Experience() {
		// TODO Auto-generated method stub
		return 0;
	}
}
