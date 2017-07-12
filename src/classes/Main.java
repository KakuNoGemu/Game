package classes;

import classes.Attacks.Attack;
import classes.Kits.Mage;
import classes.Kits.Marksman;
import classes.XML.XMLSave;

import java.util.List;

/**
 * Created by lukafaus17 on 11.07.2017.
 */
public class Main {

    public static void main(String[] args) {

        /*
        Fireball fireball = new Fireball();
        for (int i = 0; i <= 10; i++) {
            System.out.println(fireball.getSkillLevel());
            System.out.println(fireball.a);
            for (int a = 0; a <= 3; a++) {
                fireball.levelUp();
            }
        }

        Mage mage = new Mage();
        Marksman man = new Marksman();
        List<Attack> attackList = mage.attackList();
        mage.attack(man, attackList.get(0));
        System.out.println(man.getHealth());
        */

        XMLSave x = new XMLSave();
        System.out.println(x.SaveXML("settings.xml"));

    }

}
