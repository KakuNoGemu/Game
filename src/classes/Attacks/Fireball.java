
package classes.Attacks;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Fireball extends Attack {


    @Override
    public int damage() {
        return 50;
    }

    @Override
    public boolean surfaceDamage() {
        return false;
    }

    @Override
    public String name() {
        return "Fireball";
    }
}


