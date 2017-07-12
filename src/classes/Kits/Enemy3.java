
package classes.Kits;

import java.util.ArrayList;
import java.util.List;

import classes.Attacks.Attack;
import classes.Attacks.EAttack;

public class Enemy3 extends Kit {

	public int health() {

		return 80;
	}

	@Override
	public List<Attack> attackList() {
		List<Attack> attacks = new ArrayList<>();

		attacks.add(new EAttack3());
		return attacks;
	}
}