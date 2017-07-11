package classes.Attacks;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Attack {

    public abstract int damage();

    public int skillLevel = 0;
    
    public boolean attackHitted(String enemy) {

        int hitInt = (int) (Math.random() * 100);
        hitInt += skillLevel;

        if (hitInt >= 50) {
            return true;
        } else {
            return false;
        }
    }




}
