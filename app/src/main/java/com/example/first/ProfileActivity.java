package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton home, menu;
    private Button uselog,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        home = (ImageButton) findViewById(R.id.button_profile_home);
        menu = (ImageButton) findViewById(R.id.button_profile_menu);
        uselog = (Button) findViewById(R.id.button_profile_uselog);
        logout = (Button) findViewById(R.id.button_profile_logout);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_MenuActivity = new Intent(getApplicationContext(), MenuActivity.class);
                finish();
                startActivity(intent_MenuActivity);
            }
        });

        uselog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ReservelogActivity = new Intent(getApplicationContext(), ReservelogActivity.class);
                finish();
                startActivity(intent_ReservelogActivity);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}