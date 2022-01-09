package com.solvd.patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Facade pattern hides the complexity of a system by providing a simplified interface for interacting with it.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Player player = new Player();
        Server server = new Server();
        Search search = new Search();
        Map map = new Map();

        StartGameInterface startGameInterface = new StartGameInterface(player, server, search, map);
        startGameInterface.joinGame();

        //startGameInterface.quitGame();

    }

}
