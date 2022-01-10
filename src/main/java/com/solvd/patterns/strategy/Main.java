package com.solvd.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Strategy pattern - the essence of this pattern is purely in polymorphism.
 * The same action is performed depending on the way it is performed.
 * Here are used the different phases of the weapon (AWP) while walking.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Player player1 = new Player("Sniper");
        player1.goWith();

        player1.setWeaponPhase(new Scope());
        player1.goWith();
    }

}
