package com.solvd.patterns.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoScope implements AWP {

    public static final Logger LOGGER = LogManager.getLogger(NoScope.class);

    @Override
    public void takeAction() {
        LOGGER.info("Movement speed without scope: 200 units per second");
    }
}
