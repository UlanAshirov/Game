package com.company.HomeWorkGame;

public class GameEntity {
    private int health;
    private int damage;
    private String defenceType;
    private String superpower;

    public GameEntity(int health, int damage, String defenceType, String superpower) {
        this.health = health;
        this.damage = damage;
        this.defenceType = defenceType;
        this.superpower = superpower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public String getInfo() {
        return "Жизнь: " + getHealth() + ", Урон: " + getDamage() + ", Тип защиты: " + getDefenceType() + ", Суперсила " + getSuperpower();
    }
}
