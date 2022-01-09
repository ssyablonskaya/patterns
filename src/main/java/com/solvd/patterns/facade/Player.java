package com.solvd.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player {

    public static final Logger LOGGER = LogManager.getLogger(Player.class);

    public void pressToStartGame() {
        LOGGER.info("Pressing \"Accept\" button to start a game");
    }

    public void pressToEndGame() {
        LOGGER.info("Pressing \"Leave\" button to end the game");
    }

}
