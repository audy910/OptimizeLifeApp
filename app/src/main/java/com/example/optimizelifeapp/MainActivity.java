package com.example.optimizelifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String chronotype;
    private Button lionBtn, wolfBtn, bearBtn, dolphinBtn, testBtn;
    private TextView chronotypeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variables
        //buttons to assign chronotype
        lionBtn = findViewById(R.id.labor_btn);
        bearBtn = findViewById(R.id.logical_btn);
        wolfBtn = findViewById(R.id.creative_btn);
        dolphinBtn = findViewById(R.id.Social_btn);
        //link to test
        testBtn = findViewById(R.id.test_link);
        //assigned chronotype
        chronotypeText = findViewById(R.id.chronotype);


        //open test
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.drozshow.com/quizzes/whats-your-chronotype");
            }
        });
    }
    //assigning chronotype based on clicking buttons
    public void bearClicked(View view) {
        chronotype = "Bear";
        chronotypeText.setText(chronotype);
    }

    public void lionClicked(View view) {
        chronotype = "Lion";
        chronotypeText.setText(chronotype);
    }

    public void wolfClicked(View view) {
        chronotype = "Wolf";
        chronotypeText.setText(chronotype);
    }

    public void dolphinClicked(View view) {
        chronotype = "Dolphin";
        chronotypeText.setText(chronotype);
    }



    //to create web page showing website
    public void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}