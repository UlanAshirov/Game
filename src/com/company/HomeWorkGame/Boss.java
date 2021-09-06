package com.company.HomeWorkGame;

public class Boss extends GameEntity {
    Weapon weapon;

    public Boss(int health, int damage, String defenceType, String superpower, Weapon weapon) {
        super(health, damage, defenceType, superpower);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getInfo() {
        System.out.println("Оружие босса " + getWeapon());
        return super.getInfo();
    }

    @Override
    public String toString() {
        return "Boss{" +
                "weapon=" + weapon +
                '}';
    }
}

