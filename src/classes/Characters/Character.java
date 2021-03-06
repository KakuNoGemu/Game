package classes.Characters;

import classes.Attacks.Attack;
import classes.Shop.ShopItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukafaus17 on 10.07.2017.
 */
public abstract class Character {


    public List<Attack> attacks = new ArrayList<>();
    private int experience = 0;
    private int maxExperience = 100;
    private int level = 0;
    private int gold = 0;
    private boolean isLiving = true;
    private double health = health();
    private double healthMax = health;

    public abstract int health();

    public abstract List<ShopItem> availableItems();

    public abstract int goldDrop();

    public abstract List<Attack> attackList();

    public abstract String name();

    public double getHealth() {
        return health;
    }

    public void hurt(double damage) {
        health -= damage;
    }

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

    private void levelUp() {
        level += 1;
        healthMax += 10;
        experience -= maxExperience;
        maxExperience += 10;
        gold += 20;
    }

    public void heal(double amount) {

        if (health + amount > healthMax) {
            health = healthMax;
        } else {
            health += amount;
        }

    }

    public void kill(Character character) {
        character.killed();
        experience += 10;
        if (experience >= maxExperience) {
            levelUp();
        }
        gold += character.goldDrop();
    }

    public void killed() {
        isLiving = false;
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }
}
