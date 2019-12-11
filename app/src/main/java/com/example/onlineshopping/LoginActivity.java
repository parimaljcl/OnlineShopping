package com.example.onlineshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.onlineshopping.models.Registration;

public class LoginActivity extends AppCompatActivity {
    private EditText loginName, loginPass;
    private Button loginBtn, logRegBtn;
    private Registration registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginName=findViewById(R.id.LoginNameET);
        loginPass=findViewById(R.id.LoginPasswordET);
        loginBtn=findViewById(R.id.LogInbtn);
        logRegBtn=findViewById(R.id.registrationBTN);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration=new Registration();
                registration.setName(loginName.getText().toString());
                registration.setPassword(loginPass.getText().toString());
            }
        });

        logRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent);

            }
        });
    }
}
