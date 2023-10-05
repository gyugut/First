package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Home, Menu, Search, Support;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home = (ImageButton) findViewById(R.id.button_Home_Main);
        Menu = (ImageButton) findViewById(R.id.button_Menu_Main);
        Search = (ImageButton) findViewById(R.id.button_Search_Main);
        Support = (ImageButton) findViewById(R.id.button_Support_Main);

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

            }
        });

        Support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportActivity = new Intent(getApplicationContext(), SupportActivity.class);
                startActivity(intent_SupportActivity);
            }
        });
    }
}