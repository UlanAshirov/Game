package com.company.HomeWorkGame;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");

        System.out.printf("Boss health %d\nBoss damage %d\nBoss defence type %s", boss.getHealth(), boss.getDamage(), boss.getDefenceType());

    }
}
