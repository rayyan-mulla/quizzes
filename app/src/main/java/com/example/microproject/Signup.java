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

public class Signup extends AppCompatActivity {
    SignupHelper db;
    EditText name, email, age, password;
    TextView login;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        db = new SignupHelper(this);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        age = (EditText) findViewById(R.id.age);
        password = (EditText) findViewById(R.id.password);

        login = (TextView) findViewById(R.id.login);
        login.setPaintFlags(login.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button=findViewById(R.id.signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String database_name = name.getText().toString();
                String database_email = email.getText().toString();
                String string_age = age.getText().toString();
                int database_age = Integer.parseInt(string_age);
                String database_password = password.getText().toString();

                if(database_name.equals("") || database_email.equals("") || string_age.equals("") || database_password.equals("")) {
                    Toast.makeText(Signup.this, "Please!! Fill all the Details...", Toast.LENGTH_SHORT).show();
                }
                else {
                    boolean check_email = db.check_email(database_email);
                    if(check_email == true){
                        boolean insert = db.insert(database_name,database_email,database_age,database_password);
                        if(insert == true){
                            Toast.makeText(Signup.this, "Registration Completed Successfully!!", Toast.LENGTH_SHORT).show();
                            openActivity2();
                        }
                    }
                    else{
                        Toast.makeText(Signup.this, "Sorry Registration Unsuccessful!!\nEmail Address Already Exists", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}
