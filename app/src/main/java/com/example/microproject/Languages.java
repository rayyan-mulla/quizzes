package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Languages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        Button android = (Button) findViewById(R.id.android);
        Button c_plus = (Button) findViewById(R.id.c_plus);
        Button javascript = (Button) findViewById(R.id.javascript);
        Button python = (Button) findViewById(R.id.python);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openAndroid();
            }
        });
        c_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCPlus();
            }
        });
        javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJavaScript();
            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPython();
            }
        });
    }

    public void openAndroid() {
        Intent i = new Intent(this,Android.class);
        startActivity(i);
    }

    public void openCPlus() {
        Intent i = new Intent(this,CPlus.class);
        startActivity(i);
    }

    public void openJavaScript() {
        Intent i = new Intent(this,JavaScript.class);
        startActivity(i);
    }

    public void openPython() {
        Intent i = new Intent(this,Python.class);
        startActivity(i);
    }
}
