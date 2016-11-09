package com.example.user.rockpaper;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RockPaperScissors {

    private String mMove;
    private String mComputerMove;
    private HashMap<String, String> mWinLookUp;

    public RockPaperScissors(String move) {

        mMove = move;
        mComputerMove = getComputerMove();
        mWinLookUp = new HashMap<String, String>();
        setUpWinLookup();

    }

    private void setUpWinLookup() {

        mWinLookUp.put("scissors", "paper");
        mWinLookUp.put("paper", "rock");
        mWinLookUp.put("rock", "scissors");
    }

    private String getComputerMove() {

        String[] moves = {

                "rock",
                "paper",
                "scissors"
        };

        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        return moves[randomNumber];
    }




}
