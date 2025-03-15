package com.java.academy;

public class TennisGame {
    private Player playerA;
    private Player playerB;

    public TennisGame(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }
}
