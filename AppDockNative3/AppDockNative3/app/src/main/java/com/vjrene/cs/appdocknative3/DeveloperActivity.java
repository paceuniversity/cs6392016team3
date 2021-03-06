package com.vjrene.cs.appdocknative3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DeveloperActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        ImageView home = (ImageView) findViewById(R.id.devToHome);
        Button survButton = (Button) findViewById(R.id.devToSurvey);
        Button educButton = (Button) findViewById(R.id.devToEdu);
        Button getApp = (Button) findViewById(R.id.getApp);

        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(DeveloperActivity.this, AppPageActivity.class);
                startActivity(intent);
            }
        });
        survButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(DeveloperActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
        });
        educButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(DeveloperActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });

        getApp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                goStore();
            }
        });

    }

    protected void goStore(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.okb.crossybricks&hl=en"));
        //market://details?id=com.okb.crossybricks&hl=en

        startActivity(intent);
    }
}
