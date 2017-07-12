package classes.Attacks;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public class Arrow extends Attack {


    @Override
    public int damage() {
        return 30;
    }

    @Override
    public boolean surfaceDamage() {
        return false;
    }
}
