package com.example.user.rockpaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class ResultActivity extends AppCompatActivity {

    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mResultText = (TextView)  findViewById(R.id.result_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        mResultText.setText(result);

    }


}
