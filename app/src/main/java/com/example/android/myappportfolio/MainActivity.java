package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.app1);
        Button b2 = (Button) findViewById(R.id.app2);
        Button b3 = (Button) findViewById(R.id.app3);
        Button b4 = (Button) findViewById(R.id.app4);
        Button b5 = (Button) findViewById(R.id.app5);
        Button b6 = (Button) findViewById(R.id.app6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {

            case R.id.app1:
                Toast toast1 = Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies App", Toast.LENGTH_SHORT);
                toast1.show();
                break;
            case R.id.app2:
                Toast toast2 = Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk App", Toast.LENGTH_SHORT);
                toast2.show();
                break;
            case R.id.app3:
                Toast toast3 = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT);
                toast3.show();
                break;
            case R.id.app4:
                Toast toast4 = Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material App", Toast.LENGTH_SHORT);
                toast4.show();
                break;
            case R.id.app5:
                Toast toast5 = Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT);
                toast5.show();
                break;
            case R.id.app6:
                Toast toast6 = Toast.makeText(getApplicationContext(), "This button will launch my Capstone App", Toast.LENGTH_SHORT);
                toast6.show();
                break;
            default:
                break;
        }
    }
}
