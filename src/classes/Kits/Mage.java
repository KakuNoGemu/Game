package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.Fireball;

import java.util.List;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Mage extends Kit {

    /**
     * @return health of the kit
     */
    @Override
    public int health() {
        return 120;
    }

    /**
     * @return attacks of the kit
     */
    @Override
    public List<Attack> attackList() {

        attacks.add(new Fireball());
        return attacks;
    }

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "Mage";
    }

	@Override
	public int Experience() {
		// TODO Auto-generated method stub
		return 0;
	}
}
