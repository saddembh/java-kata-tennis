package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {

    @Test
    public void initialScoreShouldBeZeroForBothPlayers() {
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB);
        assertAll(
                "Tennis Game Initial State",
                () -> assertEquals(0, game.getPlayerA().getScore(), "Player A score should be 0"),
                () -> assertEquals(0, game.getPlayerB().getScore(), "Player B score should be 0")
        );
    }

    @Test
    public void playerAWinsFirstPoint() {
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB);
        assertAll(
                "Player A Wins First Point",
                () -> assertEquals(1, game.getPlayerA().getScore(), "Player A score should be 1"),
                () -> assertEquals(0, game.getPlayerB().getScore(), "Player B score should be 0")
        );
    }
}
