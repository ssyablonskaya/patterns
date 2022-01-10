package com.solvd.patterns.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Player implements StartGame {

    public static final Logger LOGGER = LogManager.getLogger(Player.class);

    private String nickName;

    public Player(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void onRoundStarted(String message) {
        LOGGER.debug(String.format("NickName: %s, Message -> %s", nickName, message));
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
