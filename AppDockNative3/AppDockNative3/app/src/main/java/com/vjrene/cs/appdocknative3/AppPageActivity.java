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

public class AppPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_page);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);
        Button surveyButton = (Button) findViewById(R.id.surveyBtn);
        Button devButton = (Button) findViewById(R.id.developerBtn);
        Button eduButton = (Button) findViewById(R.id.educationBtn);
        ImageView appImg = (ImageView) findViewById(R.id.a);


        surveyButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(AppPageActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
        });
        devButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(AppPageActivity.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });
        eduButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(AppPageActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });
        appImg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(AppPageActivity.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });



    }

}
