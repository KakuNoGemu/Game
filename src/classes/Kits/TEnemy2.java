package classes.Kits;

import java.util.ArrayList;
import java.util.List;

import classes.Attacks.Attack;
import classes.Attacks.TAttack;

public class TEnemy2 extends Kit {

	public int health() {

		return 600;
	}

	@Override
	public List<Attack> attackList() {
		List<Attack> attacks = new ArrayList<>();

		attacks.add(new TAttack());
		return attacks;
	}
}
