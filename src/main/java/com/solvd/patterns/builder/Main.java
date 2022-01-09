package com.solvd.patterns.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Builder pattern is used when we need to set a lot of properties (for example, in API testing).
 * Builder looks much more readable.
 * It is also not necessary to fill in all the parameters of the object.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Weapon weapon1 = Weapon.builder()
                .name("AK-47")
                .weaponClass("Assault rifles")
                .shootingMode("Automatic")
                .availability("Terrorists")
                .price(2700)
                .origin("USSR, Russia")
                .rateOfFire(600)
                .rangeOfDefeat("25 m")
                .inConsole("weapon_ak47")
                .build();

        Weapon weapon2 = Weapon.builder()
                .name("AK-47")
                .weaponClass("Assault rifles")
                .shootingMode("Automatic")
                .availability("Counter-Terrorists")
                .price(2900)
                .origin("USA")
                .rateOfFire(600)
                .rangeOfDefeat("30 m")
                .peculiarity("Muffler")
                .inConsole("weapon_m4a1_silencer")
                .build();

        LOGGER.debug(weapon1 + "\n");
        LOGGER.debug(weapon2);


    }

}
