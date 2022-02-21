package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    SignupHelper db;
    EditText email, password;
    TextView sign_up,forgot_password;
    private Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new SignupHelper(this);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        login_button = findViewById(R.id.login);
        sign_up = (TextView) findViewById(R.id.signup);
        sign_up.setPaintFlags(sign_up.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        forgot_password = (TextView) findViewById(R.id.forgot_password);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String database_email = email.getText().toString();
                String database_password = password.getText().toString();

                if (database_email.equals("") || database_password.equals("")) {
                    Toast.makeText(Login.this, "Please Enter Email Address and Password", Toast.LENGTH_SHORT).show();
                } else {
                    boolean verify = db.verify_email_password(database_email, database_password);
                    if (verify == true) {
                        Toast.makeText(Login.this, "Login Successful!!", Toast.LENGTH_SHORT).show();
                        openActivity2();
                    } else {
                        Toast.makeText(Login.this, "Invalid Email Address or Password!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Sorry User!!\nYou have to Sign Up Again as You have Forgotten your Login Password", Toast.LENGTH_LONG).show();
                openActivity3();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Languages.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
}
