package com.solvd.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pistol implements Weapon {

    public static final Logger LOGGER = LogManager.getLogger(Pistol.class);

    @Override
    public void shoot() {
        LOGGER.info("Pew, pew, pew");
    }

}
