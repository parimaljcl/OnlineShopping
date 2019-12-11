package com.example.onlineshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.onlineshopping.models.Registration;

public class RegistrationActivity extends AppCompatActivity {

    private EditText nameET,phoneET,emailET,passwordET;
    private Button registerBTN;
    private Registration registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        nameET=findViewById(R.id.nameET);
        phoneET=findViewById(R.id.phoneET);
        emailET=findViewById(R.id.emailET);
        passwordET=findViewById(R.id.passwordET);
        registerBTN=findViewById(R.id.registerBTN);

        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration=new Registration();
                registration.setName(nameET.getText().toString());
                registration.setPhone(phoneET.getText().toString());
                registration.setEmail(emailET.getText().toString());
                registration.setPassword(passwordET.getText().toString());
                Toast.makeText(RegistrationActivity.this,"Name: "+registration.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }


}
