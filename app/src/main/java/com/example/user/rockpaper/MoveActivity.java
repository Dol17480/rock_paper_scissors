package com.example.user.rockpaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class MoveActivity extends AppCompatActivity {

    Button mScissorsButton;
    Button mRockButton;
    Button mPaperButton;
    TextView mWinCountText;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        mScissorsButton = (Button) findViewById(R.id.scissors_button);
        mRockButton = (Button) findViewById(R.id.rock_button);
        mPaperButton = (Button) findViewById(R.id.paper_button);
        mWinCountText = (TextView)  findViewById(R.id.win_count_text);
        String count = "Wins: ";
        count += Integer.toString(RockPaperScissors.getWinCount());
        mWinCountText.setText(count);

        mScissorsButton.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Log.d("RockPaper", "Scissors button called");
                String playerMove = "scissors";
                RockPaperScissors game = new RockPaperScissors(playerMove);
                String result = game.result();
                Intent intent = new Intent(MoveActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });


        mRockButton.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String playerMove = "rock";
                RockPaperScissors game = new RockPaperScissors(playerMove);
                String result = game.result();
                Intent intent = new Intent(MoveActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });

        mPaperButton.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String playerMove = "paper";
                RockPaperScissors game = new RockPaperScissors(playerMove);
                String result = game.result();
                Intent intent = new Intent(MoveActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });






    }

}
