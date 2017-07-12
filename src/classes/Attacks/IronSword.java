package classes.Attacks;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class IronSword extends Attack {

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public boolean surfaceDamage() {
        return false;
    }
}
