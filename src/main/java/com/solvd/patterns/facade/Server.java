package com.solvd.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server {

    public static final Logger LOGGER = LogManager.getLogger(Server.class);

    public void findServer() {
        LOGGER.info("Searching for server...");
    }

}
