package com.java.academy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {

    @Test
    public void initialScoreShouldBeZeroForBothPlayers() {
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB, "");
        assertAll(
                "Tennis Game Initial State",
                () -> assertEquals(0, game.getPlayerA().getScore(), "Player A score should be 0"),
                () -> assertEquals(0, game.getPlayerB().getScore(), "Player B score should be 0")
        );
    }

    @Test
    public void playerAWinsFirstPoint() {
        List<String> trackingScore = List.of("Player A : 15 / Player B : 0");
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB, "A");
        game.start();
        assertAll(
                "Player A scores",
                () -> assertEquals(1, game.getPlayerA().getScore(), "Player A score should be 1"),
                () -> assertEquals(0, game.getPlayerB().getScore(), "Player B score should be 0"),
                () -> assertEquals(trackingScore, game.getTrackingScore(), "Tracking score should be " + trackingScore)
        );
    }

    @Test
    public void playerAWinsTheGame() {
        List<String> trackingScore = List.of(
                "Player A : 15 / Player B : 0",
                "Player A : 30 / Player B : 0",
                "Player A : 40 / Player B : 0",
                "Player A wins the game");
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB, "AAAA");
        game.start();
        assertAll(
                "Player A wins the game",
                () -> assertEquals(4, game.getPlayerA().getScore(), "Player A score should be 4"),
                () -> assertEquals(0, game.getPlayerB().getScore(), "Player B score should be 0"),
                () -> assertEquals(trackingScore, game.getTrackingScore(), "Tracking score should be " + trackingScore)
        );
    }

    @Test
    public void playerBWinsWithDeuceScenario() {
        List<String> trackingScore = List.of(
                "Player A : 15 / Player B : 0",
                "Player A : 15 / Player B : 15",
                "Player A : 30 / Player B : 15",
                "Player A : 30 / Player B : 30",
                "Player A : 40 / Player B : 30",
                "Deuce",
                "Advantage Player B",
                "Player B wins the game"
        );
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB, "ABABABBB");
        game.start();
        assertAll(
                "Player B wins the game",
                () -> assertEquals(trackingScore, game.getTrackingScore(), "Tracking score should be " + trackingScore)
        );
    }

    @Test
    public void playerBWinsWithMoreThanOneDeuce() {
        List<String> trackingScore = List.of(
                "Player A : 15 / Player B : 0",
                "Player A : 15 / Player B : 15",
                "Player A : 30 / Player B : 15",
                "Player A : 30 / Player B : 30",
                "Player A : 40 / Player B : 30",
                "Deuce",
                "Advantage Player B",
                "Deuce",
                "Advantage Player B",
                "Player B wins the game"
        );
        Player playerA = new Player("A");
        Player playerB = new Player("B");
        TennisGame game = new TennisGame(playerA, playerB, "ABABABBABB");
        game.start();
        assertAll(
                "Player B wins the game",
                () -> assertEquals(trackingScore, game.getTrackingScore(), "Tracking score should be " + trackingScore)
        );
    }
}
