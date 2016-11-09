package com.example.user.rockpaper;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/11/2016.
 */

public class RockPaperScissorsTest {

    RockPaperScissors game;
    String playerMove;
    ArrayList<String> results;

    @Before
    public void before() {
        playerMove = "scissors";
        game = new RockPaperScissors(playerMove);
        results = new ArrayList<String>();
        results.add("win");
        results.add("lose");
        results.add("draw");
    }

    @Test
    public void canGetPlayerMove() {
        assertEquals("scissors", game.getPlayerMove());
    }

    @Test
    public void gameCanHaveWinner() {
        String result = game.winChecker();

        assertEquals(true, results.contains(result));
    }

    @Test
    public void canGetWinCount() {
        game = new RockPaperScissors("rock");
        game.result();
        game = new RockPaperScissors("rock");
        game.result();
        game = new RockPaperScissors("rock");
        game.result();
        assertEquals(true, RockPaperScissors.getWinCount() > 0 );
    }

}
