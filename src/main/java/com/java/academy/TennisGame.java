package com.java.academy;

import java.util.ArrayList;
import java.util.List;

public class TennisGame {
    private Player playerA;
    private Player playerB;
    private String scoringChain;
    private List<String> trackingScore = new ArrayList<>();

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

    public List<String> getTrackingScore() {
        return trackingScore;
    }

    public void start() {
        for (char pointForPlayer : scoringChain.toCharArray()) {
            if (pointForPlayer == 'A') {
                playerA.incrementScore();
            } else if (pointForPlayer == 'B') {
                playerB.incrementScore();
            }
            if (isGameWon(playerA.getScore(), playerB.getScore())) {
                trackingScore.add("Player " + (playerA.getScore() > playerB.getScore() ? "A" : "B") + " wins the game");
            } else {
                trackingScore.add(formatScore(playerA.getScore(), playerB.getScore()));
            }
        }
    }

    private static boolean isGameWon(int playerAScore, int playerBScore) {
        return (playerAScore >= 4 && (playerAScore - playerBScore)  >= 2) ||
                (playerBScore >= 4 && (playerBScore - playerAScore) >= 2);
    }


    private static String formatScore(int playerAScore, int playerBScore) {
        if (playerAScore >= 3 && playerBScore >= 3) {
            if (playerAScore == playerBScore) {
                return "Deuce";
            } else {
                return "Advantage Player " + (playerAScore > playerBScore ? "A" : "B");
            }
        } else {
            return "Player A : " + convertScore(playerAScore) + " / Player B : " + convertScore(playerBScore);
        }
    }

    private static String convertScore(int score) {
        switch (score) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }


}
