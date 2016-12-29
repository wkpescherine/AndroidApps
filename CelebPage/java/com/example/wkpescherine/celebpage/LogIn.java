package com.example.wkpescherine.celebpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText email = (EditText) findViewById(R.id.enter_email);
        EditText password = (EditText) findViewById(R.id.enter_password);

    }

    public void onClickNonLogIn(View view) {
        Intent myintent = new Intent(this,Home.class);
        startActivity(myintent);
    }

    public void onClickCreateAccount(View view) {
        Intent myintent = new Intent(this,CreateAccount.class);
        startActivity(myintent);
    }

    public void onClickResetPassword(View view) {
        Intent myintent = new Intent(this,ResetPassword.class);
        startActivity(myintent);
    }

    public void onClickLogIn(View view) {
        Intent myintent = new Intent(this,Home.class);
        startActivity(myintent);
    }

}
