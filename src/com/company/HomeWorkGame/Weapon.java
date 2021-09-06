package com.company.HomeWorkGame;

public class Weapon {
    private String typeWeapon;
    private String weaponName;

    public Weapon() {
    }

    public Weapon(String typeWeapon, String weaponName) {
        this.typeWeapon = typeWeapon;
        this.weaponName = weaponName;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "typeWeapon='" + typeWeapon + '\'' +
                ", weaponName='" + weaponName + '\'' +
                '}';
    }
}
