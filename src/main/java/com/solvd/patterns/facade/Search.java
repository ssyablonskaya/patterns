package com.solvd.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Search {

    public static final Logger LOGGER = LogManager.getLogger(Search.class);

    public void findPlayers() {
        LOGGER.info("Searching for players...");
    }

}
