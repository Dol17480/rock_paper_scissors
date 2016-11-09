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
    protected static int winCount = 0;

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

    public static int getWinCount() {
        return winCount;
    }

    public String result() {
        String result = String.format("Your move: %s. Computer move: %s.%n You %s", mMove, mComputerMove, winChecker());
        return result;
    }

    public String winChecker() {
        String result = "";
        if (mWinLookUp.get(mMove).equals(mComputerMove)) {
            result += "win";
            winCount++;
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
