package com.solvd.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Scope implements AWP {

    public static final Logger LOGGER = LogManager.getLogger(Scope.class);

    @Override
    public void takeAction() {
        LOGGER.info("Movement speed with scope: 100 units per second");
    }

}
