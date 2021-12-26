package com.example.optimizelifeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private String chronotype;
    private Button lionBtn, wolfBtn, bearBtn, dolphinBtn, testBtn,addEventBtn, editEventsBtn;
    private TextView chronotypeText;

    //add event layout variables
    private EditText deadlineDate;
    private EditText titleText, descriptionText;
    private Button submit, logicalBtn, laborBtn, socialBtn, creativeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising add event layout variables
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




        //initialize  main activity variables
        //buttons to assign chronotype
        lionBtn = findViewById(R.id.labor_btn);
        bearBtn = findViewById(R.id.logical_btn);
        wolfBtn = findViewById(R.id.creative_btn);
        dolphinBtn = findViewById(R.id.social_btn);
        //buttons to edit/add events
        addEventBtn = findViewById(R.id.add_event_btn);
        editEventsBtn = findViewById(R.id.edit_events_btn);
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

        //take to addEvent activity when add event btn clicked
        addEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendAddEvent = new Intent(MainActivity.this, addEvent.class);
                sendAddEvent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(sendAddEvent);
                finish();
            }
        });
//        //create event when submit clicked
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String title = titleText.toString();
//                String description = descriptionText.toString();
//                String eventType = getEventType();
//                String deadline = deadlineDate.toString();
//                event event1 = new event(title, description, eventType,deadline);
//                Toast.makeText(this, event1.getDescription() + event1.getTitle(), Toast.LENGTH_SHORT).show();
//            }
//        });
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
    //in order to put the type of event into a string for creating events
    public String getEventType()
    {
        String eventType = "";
        if (laborBtn.isSelected())
        {
            eventType.concat("labor ") ;
        }
        if(logicalBtn.isSelected())
        {
            eventType.concat("logic ");
        }
        if(socialBtn.isSelected())
        {
            eventType.concat("social ");
        }
        if(creativeBtn.isSelected())
        {
            eventType.concat("creative ");
        }
        return eventType;
    }



    //to create web page showing website
    public void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}