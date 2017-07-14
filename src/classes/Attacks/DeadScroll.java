package classes.Attacks;

/**
 * Created by lukafaus17 on 12.07.2017.
 */
public class DeadScroll extends Attack{

    @Override
    public int damage() {
        return 45;
    }

    @Override
    public boolean surfaceDamage() {
        return true;
    }

    @Override
    public String name() {
        return "Dead Scroll";
    }
}