package com.solvd.patterns.facade;

public class StartGameInterface {

    private final Player player;
    private final Server server;
    private final Search search;
    private final Map map;

    public StartGameInterface(Player player, Server server, Search search, Map map) {
        this.player = player;
        this.server = server;
        this.search = search;
        this.map = map;
    }

    public void joinGame() {
        player.pressToStartGame();
        server.findServer();
        search.findPlayers();
        map.loadMap();
    }

    public void quitGame() {
        player.pressToEndGame();
    }

}
