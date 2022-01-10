package com.solvd.patterns.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Observer pattern: when one object changes state, all of its dependents are notified and updated automatically.
 *
 * InGameMessages for players that join any side (Terrorists or Counter-Terrorists).
 * Players receive these messages depending on which side they choose.
 */
public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        GameMessenger gameMessenger = new GameMessenger();

        gameMessenger.joinGame(SideType.TERRORISTS, new Player("Player1"));
        gameMessenger.joinGame(SideType.TERRORISTS, new Player("Player2"));

        gameMessenger.joinGame(SideType.COUNTER_TERRORISTS, new Player("Player3"));
        gameMessenger.joinGame(SideType.COUNTER_TERRORISTS, new Player("Player4"));

        gameMessenger.notifyPlayers(SideType.TERRORISTS, "Terrorists: you need to destroy the object.");
        gameMessenger.notifyPlayers(SideType.COUNTER_TERRORISTS,
                "Counter-terrorists: you need to defuse the bomb and eliminate the terrorists.");

    }

}
