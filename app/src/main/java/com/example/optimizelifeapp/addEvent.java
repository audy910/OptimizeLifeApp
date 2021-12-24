package com.example.optimizelifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class addEvent extends AppCompatActivity {

    //declaring global variables
    private String description, title, eventType, deadline;
    private TextView titleText, descriptionText, deadlineDate;
    private Button submit, logicalBtn, laborBtn, socialBtn, creativeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        //initialising variables
        //TextViews
        titleText = findViewById(R.id.title_text);
        descriptionText = findViewById(R.id.description_text);
        deadlineDate = findViewById(R.id.deadline_date);
        //Buttons
        logicalBtn = findViewById(R.id.logical_btn);
        laborBtn = findViewById(R.id.labor_btn);
        socialBtn = findViewById(R.id.social_btn);
        creativeBtn = findViewById(R.id.creative_btn);
        submit = findViewById(R.id.submit_add_event);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendMain = new Intent(addEvent.this, MainActivity.class);
                sendMain.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(sendMain);
                finish();
            }
        });

    }
}