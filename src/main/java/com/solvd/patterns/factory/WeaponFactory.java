package com.solvd.patterns.factory;

public class WeaponFactory {

    public Weapon getWeapon(WeaponType weaponType) {
        Weapon weapon = null;
        switch (weaponType) {
            case PISTOL:
                weapon = new Pistol();
                break;
            case SHOTGUN:
                weapon = new Shotgun();
                break;
            case SNIPER_RIFLE:
                weapon = new SniperRifle();
                break;
            default:
                throw new RuntimeException("Wrong weapon type!");
        }

        return weapon;

    }

}
