package com.vjrene.cs.appdocknative3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AppPageActivity extends AppCompatActivity {


    public void goToDev(View view) {
        final Intent intent = new Intent(this, DeveloperActivity.class);
        startActivity(intent);
    }

    public void goToSurvey (View view) {
        final Intent intent = new Intent(this, SurveyActivity.class);
        startActivity(intent);
    }
    public void goToEducation (View view) {
        final Intent intent = new Intent(this, EducationActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_page);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);




    }

}
