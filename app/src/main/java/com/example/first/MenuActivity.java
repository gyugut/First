package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton home, menu;
    private Button profile, setting, notice, search, support;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        home = (ImageButton) findViewById(R.id.button_menu_home);
        menu = (ImageButton) findViewById(R.id.button_menu_menu);
        profile = (Button) findViewById(R.id.button_menu_profile);
        setting = (Button) findViewById(R.id.button_menu_setting);
        notice = (Button) findViewById(R.id.button_menu_notice);
        search = (Button) findViewById(R.id.button_menu_search);
        support = (Button) findViewById(R.id.button_menu_support);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(intent_MainActivity);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ProfileActivity = new Intent(getApplicationContext(), ProfileActivity.class);
                finish();
                startActivity(intent_ProfileActivity);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_NoticeActivity = new Intent(getApplicationContext(), NoticeActivity.class);
                finish();
                startActivity(intent_NoticeActivity);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportmenuActivity = new Intent(getApplicationContext(), SupportmenuActivity.class);
                finish();
                startActivity(intent_SupportmenuActivity);
            }
        });
    }
}