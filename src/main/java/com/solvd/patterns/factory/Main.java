package com.solvd.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Factory Pattern is mostly used to create an object from one of several possible classes that implements an interface.
 * It creates objects without exposing the instantiation logic to the user.
 *
 * We need to create an object, one type came - one object, another came - another, and accordingly different behavior.
 *
 * Here you can find out what type of Weapon and can be demonstrated shooting.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        WeaponFactory weaponFactory = new WeaponFactory();

        Weapon weapon1 = weaponFactory.getWeapon(WeaponType.PISTOL);
        weapon1.shoot();

        Weapon weapon2 = weaponFactory.getWeapon(WeaponType.SHOTGUN);
        weapon2.shoot();

        Weapon weapon3 = weaponFactory.getWeapon(WeaponType.SNIPER_RIFLE);
        weapon3.shoot();

    }

}
