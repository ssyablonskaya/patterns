package com.solvd.patterns.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SniperRifle implements Weapon {

    public static final Logger LOGGER = LogManager.getLogger(SniperRifle.class);

    @Override
    public void shoot() {
        LOGGER.info("BANG");
    }

}
