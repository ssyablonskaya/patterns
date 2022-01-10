package com.solvd.patterns.listener;

import java.util.*;

public class GameMessenger {

    private static final Map<SideType, List<Player>> Listeners = new HashMap<>();

    public GameMessenger() {
        Arrays.stream(SideType.values())
                .forEach(sideType -> Listeners.put(sideType, new ArrayList<>()));
    }

    public void joinGame(SideType sideType, Player player) {
        List<Player> players = Listeners.get(sideType);
        players.add(player);
    }

    public void quitGame(SideType sideType, Player player) {
        List<Player> players = Listeners.get(sideType);
        players.remove(player);
    }

    public void notifyPlayers(SideType sideType, String message) {
        List<Player> players = Listeners.get(sideType);
        players.forEach(player -> player.onRoundStarted(message));
    }

}
