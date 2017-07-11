package classes.Kits;

import classes.Attacks.Attack;
import classes.Attacks.Fireball;

import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Kit {

    public abstract int health();

    public abstract List<Attack> attackList();

    private double dealtDamage(Attack attack, double dealtDamageMultiplier) {

        return attack.damage() * dealtDamageMultiplier;

    }

    public double attack(Attack attack) {

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
        return damage;

    }

}
