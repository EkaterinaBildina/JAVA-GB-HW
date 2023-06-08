package javaOOP04;

import javaOOP04.shield.BubbleShield;
import javaOOP04.shield.HyleanShield;
import javaOOP04.shield.ShellShield;
import javaOOP04.warriors.Archer;
import javaOOP04.warriors.Infantryman;
import javaOOP04.warriors.Warrior;
import javaOOP04.wepons.meleeWeapon.Axe;
import javaOOP04.wepons.meleeWeapon.Sword;
import javaOOP04.wepons.rangedWeapon.Bow;
import javaOOP04.wepons.rangedWeapon.CrossBow;

public class MainClass {
    public static void main(String[] args) {

        Team<Warrior> teamMixedOnline = new Team<>();
        teamMixedOnline.add(new Archer("Robin", 100, new Bow(), new ShellShield()));
        teamMixedOnline.add(new Infantryman("John", 150, new Axe(), new HyleanShield()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new ShellShield()));
        teamArchers.add(new Archer("Pitter", 100, new Bow(), new ShellShield()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new BubbleShield()));

        System.out.println("----------teamMixedOnline:------------");
        System.out.println(teamMixedOnline);
        System.out.println("----------teamArchers:------------");
        System.out.println(teamArchers);
        System.out.println("-----------teamInfantryman:-----------");
        System.out.println(teamInfantryman);

        Infantryman pl1 = new Infantryman("John", 150, new Axe(), new HyleanShield());
        Archer pl2 = new Archer("Jimmy", 100, new CrossBow(), new ShellShield());
        Battle battle1 = new Battle(pl1, pl2);

        System.out.println("----------battle1.fight:------------");
        battle1.fight();

    }
}
