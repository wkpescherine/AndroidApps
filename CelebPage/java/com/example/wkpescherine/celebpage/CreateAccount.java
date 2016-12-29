package com.example.wkpescherine.celebpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }
    public void onClickCreateAccount(View view) {
        EditText email = (EditText) findViewById(R.id.enter_email);
        EditText password = (EditText) findViewById(R.id.enter_password);
        EditText username = (EditText) findViewById(R.id.enter_username);

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String mail = email.getText().toString();

        Response.Listener<String> responseListener - new Response.Listener<String>{
            @Override
                public void onResponse(String response){
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success - jsonResponse.getBoolean("success");

                    if(success){
                        Intent myintent = new Intent(this,LogIn.class);
                        startActivity(myintent);
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }

        RegisterRequest newRegisterRequest = new RegisterRequest(user, pass, mail, );

    }

}
