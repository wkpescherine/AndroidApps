package com.example.wkpescherine.testyourbrain;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SelectionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

    }

    public void onClickSubjectChallenge(View view){
        Intent myintent = new Intent(this,SubjectSelection.class);
        startActivity(myintent);
    }
    public void onClickFullChallenge(View view){
        Intent myintent = new Intent(this,FullChallenge.class);
        startActivity(myintent);
    }
    public void onClickHighScore(View view){
        Intent myintent = new Intent(this,ighScores.class);
        startActivity(myintent);
    }
    public void onClickRules(View view){
        Intent myintent = new Intent(this,Rules.class);
        startActivity(myintent);
    }
}
