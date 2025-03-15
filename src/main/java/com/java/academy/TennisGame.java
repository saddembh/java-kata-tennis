package com.java.academy;

public class TennisGame {
    private Player playerA;
    private Player playerB;
    private String scoringChain;

    public TennisGame(Player playerA, Player playerB, String scoringChain) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.scoringChain = scoringChain;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void start() {
        for (char pointForPlayer : scoringChain.toCharArray()) {
            if (pointForPlayer == 'A') {
                playerA.incrementScore();
            } else if (pointForPlayer == 'B') {
                playerB.incrementScore();
            }
        }
    }
}
