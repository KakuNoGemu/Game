package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.Sword;

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
        return 300;
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

    @Override
    public int goldDrop() {
        return 10;
    }

    @Override
    public String name() {
        return "Swordsman";
    }


	@Override
	public int Experience() {
		// TODO Auto-generated method stub
		return 0;
	}
}