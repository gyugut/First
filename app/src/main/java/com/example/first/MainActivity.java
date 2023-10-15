package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Home, Menu, Search, Support;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home = (ImageButton) findViewById(R.id.button_main_home);
        Menu = (ImageButton) findViewById(R.id.button_main_menu);
        Search = (ImageButton) findViewById(R.id.button_main_search);
        Support = (ImageButton) findViewById(R.id.button_main_support);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_GidoActivity = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent_GidoActivity);
            }
        });

        Support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportmenuActivity = new Intent(getApplicationContext(), SupportmenuActivity.class);
                startActivity(intent_SupportmenuActivity);
            }
        });
    }
}