package com.example.moat279.ttp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class SelectionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

    }

    public void TTPwebsite(View view)
    {  Intent myintent = new Intent(this,TTPwebsite.class);
        startActivity(myintent);
    }

    public void News1(View view)
    {  Intent myintent = new Intent(this,News.class);
        String newURL = "http://www.alleywatch.com/2017/02/can-recruit-absolute-best-talent-startup/";
        myintent.putExtra("key", newURL);
        startActivity(myintent);
    }

    public void News2(View view)
    {  Intent myintent = new Intent(this,News.class);
        String newURL = "http://www.alleywatch.com/2017/02/nyc-startup-bowmo-brings-recruiting-back-to-earth/";
        myintent.putExtra("key", newURL);
        startActivity(myintent);
    }

    public void News3(View view)
    {  Intent myintent = new Intent(this,News.class);
        String newURL = "http://www.huffingtonpost.com/steve-mariotti/nfte-and-nycedc-pioneer_b_3943931.html";
        myintent.putExtra("key", newURL);
        startActivity(myintent);
    }

    public void News4(View view)
    {  Intent myintent = new Intent(this,News.class);
        String newURL = "http://www.digital.nyc/news/nyc-startup-just-raised-35m-bring-location-data-your-marketing-efforts";
        myintent.putExtra("key", newURL);
        startActivity(myintent);
    }


    public void MentorSection(View view){
        Intent myintent = new Intent(this,MentorSection.class);
        startActivity(myintent);
    }

    public void JobPosting(View view){
        Intent myintent = new Intent(this,JobPostings.class);
        startActivity(myintent);
    }

    public void TutorialLessonSection(View view){
        Intent myintent = new Intent(this,TutorialLessonSection.class);
        startActivity(myintent);
    }

    public void VideoLessonSection(View view){
        Intent myintent = new Intent(this,VideoTutorials.class);
        startActivity(myintent);
    }
}
