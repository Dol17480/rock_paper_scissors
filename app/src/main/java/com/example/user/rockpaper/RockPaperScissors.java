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
        mComputerMove = setComputerMove();
        mWinLookUp = new HashMap<String, String>();
        setUpWinLookup();
    }

    public String getPlayerMove() {
        return mMove;
    }

    public String getComputerMove() {
        return mComputerMove;
    }

    public String winChecker() {
        String result = "";
        if (mWinLookUp.get(mMove).equals(mComputerMove)) {
            result += "win";
        } else if (mWinLookUp.get(mComputerMove).equals(mMove)) {
            result += "lose";
        } else {
            result += "draw";
        }
        return result;
    }

    private void setUpWinLookup() {

        mWinLookUp.put("scissors", "paper");
        mWinLookUp.put("paper", "rock");
        mWinLookUp.put("rock", "scissors");
    }

    private String setComputerMove() {

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
