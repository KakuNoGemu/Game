package classes.Attacks;


/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Attack {

    private int skillLevel = 0;
    private int usedTimes = 0;

    public abstract boolean surfaceDamage();

    public abstract String name();

    public abstract int damage();

    public int getSkillLevel() {
        return skillLevel;
    }

    private boolean attackHitted() {

        int hitInt = (int) (Math.random() * 200);
        hitInt += skillLevel;

        if (hitInt >= 60) {
            return true;
        } else {
            return false;
        }
    }

    private boolean criticalHit() {

        int hitInt = (int) (Math.random() * 100);
        hitInt += skillLevel;

        if (hitInt >= 90) {
            return true;
        } else {
            return false;
        }
    }

    public void levelUp() {
        if (skillLevel <= 50) {
            skillLevel += 1;
        }
    }

    public double dealtDamageMultiplier() {

        if (attackHitted()) {

            if (criticalHit()) {
                return 1.5;
            } else {
                return 1;
            }

        } else {
            return 0;
        }

    }

    public void weaponUsed() {
        usedTimes += 1;
        if (usedTimes % 10 == 0) {
            levelUp();
        }
    }

}
