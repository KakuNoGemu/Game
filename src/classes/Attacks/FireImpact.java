package classes.Attacks;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class FireImpact extends Attack{

    @Override
    public int damage() {
        return 40;
    }

    @Override
    public boolean surfaceDamage() {
        return true;
    }

    @Override
    public String name() {
        return "Fire Impact";
    }
}
