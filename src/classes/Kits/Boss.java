package classes.Kits;

import java.util.ArrayList;
import java.util.List;

import classes.Attacks.Attack;
import classes.Attacks.BAttack;

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
}
