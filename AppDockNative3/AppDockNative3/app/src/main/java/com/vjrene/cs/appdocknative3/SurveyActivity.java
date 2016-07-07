package com.vjrene.cs.appdocknative3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SurveyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);



        ImageView home = (ImageView) findViewById(R.id.survToHome);
        Button devlButton = (Button) findViewById(R.id.survToDev);
        Button educButton = (Button) findViewById(R.id.survToEdu);

        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, AppPageActivity.class);
                startActivity(intent);
            }
        });
        devlButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });
        educButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(SurveyActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });

    }

}
