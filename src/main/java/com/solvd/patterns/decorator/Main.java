package com.solvd.patterns.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Decorator pattern allows you to dynamically connect to an object additional functionality.
 * Changing the implementation / Adding the implementation with additional actions.
 * Decorators provide a flexible alternative for extending functionality.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Ammunition defaultAmmunition = new AmmunitionImpl();
        LOGGER.debug("Ammunition: " + defaultAmmunition.getList());
        LOGGER.debug("Cost: " + defaultAmmunition.getCost());
        System.out.println("_________________________________________________________________________________");

        Ammunition newAmmunition1 = new Armor(new AmmunitionImpl());
        LOGGER.debug("Ammunition: " + newAmmunition1.getList());
        LOGGER.debug("Cost: " + newAmmunition1.getCost());
        System.out.println("_________________________________________________________________________________");

        Ammunition newAmmunition2 = new DefuseKit(new Armor(new AmmunitionImpl()));
        LOGGER.debug("Ammunition: " + newAmmunition2.getList());
        LOGGER.debug("Cost: " + newAmmunition2.getCost());

    }

}
