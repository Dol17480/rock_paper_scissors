package com.example.user.rockpaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 09/11/2016.
 */

public class MoveActivity extends AppCompatActivity {

    Button mScissorsButton;
    Button mRockButton;
    Button mPaperButton;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        mScissorsButton = (Button) findViewById(R.id.scissors_button);
        mRockButton = (Button) findViewById(R.id.rock_button);
        mPaperButton = (Button) findViewById(R.id.paper_button);

        mScissorsButton.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Log.d("RockPaper", "Scissors button called");
                String playerMove = "scissors";
                RockPaperScissors game = new RockPaperScissors(playerMove);
                String result = game.winChecker();
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
                String result = game.winChecker();
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
                String result = game.winChecker();
                Intent intent = new Intent(MoveActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }

        });






    }

}
