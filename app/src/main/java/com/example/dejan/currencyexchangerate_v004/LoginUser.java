package com.example.dejan.currencyexchangerate_v004;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginUser extends AppCompatActivity {

    EditText Username,Password;
    Button Login;
    TextView RegisterLink, CurrencyHNBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        Username= (EditText) findViewById(R.id.Username);
        Password= (EditText) findViewById(R.id.Password);
        Login= (Button) findViewById(R.id.Login);
        RegisterLink= (TextView) findViewById(R.id.RegisterLink);
        CurrencyHNBlink= (TextView) findViewById(R.id.CurrencyHNBlink);

        RegisterLink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent registerIntent = new Intent(LoginUser.this,RegisterUser.class);
                LoginUser.this.startActivity(registerIntent);
            }
        });

        CurrencyHNBlink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent registerIntent = new Intent(LoginUser.this,Currency.class);
                LoginUser.this.startActivity(registerIntent);
            }
        });
    }
}
