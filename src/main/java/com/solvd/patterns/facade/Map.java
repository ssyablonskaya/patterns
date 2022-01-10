package com.solvd.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Map {

    public static final Logger LOGGER = LogManager.getLogger(Map.class);

    public void loadMap() {
        LOGGER.info("Map is loading...");
    }

}
