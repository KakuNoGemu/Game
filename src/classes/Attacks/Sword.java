package classes.Attacks;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Sword extends Attack {

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public boolean surfaceDamage() {
        return false;
    }

    @Override
    public String name() {
        return "Sword";
    }
}
