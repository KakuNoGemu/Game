package classes.Kits;

import classes.Attacks.Attack;

import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Kit {

    abstract int health();

    private int experience = 0;

    private int maxExperience = 100;

    private int level = 0;

    private int gold = 0;

    private boolean isLiving = true;

    abstract int goldDrop();

    private double health = health();

    public abstract List<Attack> attackList();

    public double getHealth() {
        return health;
    }

    public void hurt(double damage) {
        health -= damage;
    }

    private double dealtDamage(Attack attack, double dealtDamageMultiplier) {
        return attack.damage() * dealtDamageMultiplier;
    }

    public void attack(Kit kit, Attack attack) {

        String message;
        double dealtDamageMultiplier = attack.dealtDamageMultiplier();
        if (dealtDamageMultiplier == 0) {
            message = "Verfehlt!";
        } else if (dealtDamageMultiplier == 1.5) {
            message = "Kritischer Treffer!";
        } else {
            message = "Getroffen!";
        }

        System.out.println(message);
        double damage = dealtDamage(attack, dealtDamageMultiplier);
        kit.hurt(damage);
        attack.weaponUsed();

    }

    private void levelUp() {
        level += 1;
        experience -= maxExperience;
        maxExperience += 10;
        gold += 20;
    }

    public void kill(Kit kit) {
        kit.killed();
        experience += 10;
        if (experience >= maxExperience) {
            levelUp();
        }
        gold += kit.goldDrop();
    }

    private void killed() {
        isLiving = false;
    }

}
