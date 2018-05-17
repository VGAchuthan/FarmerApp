package com.example.user.farmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btlog;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btlog=(Button)findViewById(R.id.button1);
        btlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            in=new Intent(Login.this,RegisterOne.class);
            startActivity(in);
            }
        });
    }
}
