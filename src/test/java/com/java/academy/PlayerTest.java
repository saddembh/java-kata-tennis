package com.java.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void newPlayerTest() {
        Player player = new Player("Player 1");
        assertEquals("Player 1", player.getName());
        assertEquals(0, player.getScore());
    }

    @Test
    public void playerWinsPointTest() {
        Player player = new Player("Player 1");
        player.incrementScore();
        assertEquals("Player 1", player.getName());
        assertEquals(1, player.getScore());
    }
}
