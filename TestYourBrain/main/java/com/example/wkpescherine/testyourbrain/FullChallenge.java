package com.example.wkpescherine.testyourbrain;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Random;


public class FullChallenge extends AppCompatActivity {

    String [] Questions = {"Capital of America","What coast is New York on", "Atomic weight of Oxygen", "2*2"};
    String [] Answers = {"washington dc","east","8","4"};
    int count = 0;
    TextView question;
    EditText user_answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_challenge);

        C
        user_answer = (EditText) findViewById(R.id.new_words);

        question.setText(Questions[count]);

    }

    public void GameRunning(View v){
        //TextView question = (TextView) findViewById(R.id.question);
        EditText user_answer = (EditText) findViewById(R.id.new_words);

        question.setText(Questions[count]);

        String x = user_answer.getText().toString();
        String answer = x.toLowerCase();

        if (count >= Questions.length -1)
        {
            Toast.makeText(this, "YOU'VE ANSWERED ALL QUESTION.", Toast.LENGTH_LONG).show();
        } else if(count < Questions.length -1 && answer.equals(Answers[count]))
        {
            count++;
            question.setText(Questions[count]);

            Toast.makeText(this, "CORRECT ANSWER", Toast.LENGTH_LONG).show();

            score += 1;

            TextView scoreText = (TextView) findViewById(R.id.score_num);

            scoreText.setText(score + "");

            
        } else if (count < Questions.length -1 && !answer.equals(Answers[count]) )
        {
            Toast.makeText(this, "WRONG ANSWER TRY AGAIN", Toast.LENGTH_LONG).show();

            score -= 1;

            TextView scoreText = (TextView) findViewById(R.id.score_num);

            scoreText.setText(score + "");

        }
    }
    }

