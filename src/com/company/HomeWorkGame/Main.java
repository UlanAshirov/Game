package com.company.HomeWorkGame;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setTypeWeapon("Axe");

        Boss boss = new Boss(700, 50, "Magical", "No superpower", weapon);
        System.out.println(boss.getInfo());



    /*    Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");

        System.out.printf("Boss health %d\nBoss damage %d\nBoss defence type %s\n", boss.getHealth(), boss.getDamage(), boss.getDefenceType());

        System.out.println(Arrays.toString(createHeroes()));
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(230, 25, "damage + 10 all heroes");
        Hero hero2 = new Hero(215, 10, "defence + 5");
        Hero hero3 = new Hero(220, 15, "no superpower");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;*/
    }
}
