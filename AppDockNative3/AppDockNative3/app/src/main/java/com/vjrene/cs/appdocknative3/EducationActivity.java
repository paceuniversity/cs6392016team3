package com.vjrene.cs.appdocknative3;

import android.os.AsyncTask;
import android.os.Bundle;
import android.content.*;
import android.graphics.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import java.net.*;
import java.io.*;

public class EducationActivity extends AppCompatActivity {




    ImageView vidView;
    String vidURL = "https://raw.githubusercontent.com/paceuniversity/cs6392016team3/master/appdockscreen.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        ImageView homeic = (ImageView) findViewById(R.id.home);
        Button develButton = (Button) findViewById(R.id.developerBtn);
        Button survButton = (Button) findViewById(R.id.surveyBtn);
        Button educaButton = (Button) findViewById(R.id.educationBtn);

        homeic.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, AppPageActivity.class);
                startActivity(intent);
            }
        });

        develButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, DeveloperActivity.class);
                startActivity(intent);
            }
        });
        educaButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });

        survButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
        });




        vidView = (ImageView) findViewById(R.id.videoView);
        downloadVid download = new downloadVid();
        download.execute();



    }

    private class downloadVid extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Bitmap doInBackground(String... params) {

            try {
                URL url = new URL(vidURL);
                InputStream is = url.openConnection().getInputStream();
                Bitmap finalVideo = BitmapFactory.decodeStream(is);

                return finalVideo;

            } catch (Exception e) {

                Context context = getApplicationContext();
                //CharSequence text = "Could not load image. Check connection.";
                CharSequence text = "Could not load video. Check connection.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

            return null;

        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {

            vidView.setImageBitmap(bitmap);

        }
    }

}
