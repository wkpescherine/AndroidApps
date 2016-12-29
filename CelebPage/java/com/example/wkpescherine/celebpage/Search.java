package com.example.wkpescherine.celebpage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Search extends AppCompatActivity {

    TextView setView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        setView = (TextView) findViewById(R.id.search_header222);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/script.ttf");
        setView.setTypeface(myCustomFont);
    }
}
