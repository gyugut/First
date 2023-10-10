package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NoticeActivity extends AppCompatActivity {

    private Button back;
    private ImageButton home, menu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        back = (Button) findViewById(R.id.button_notice_back);
        home = (ImageButton) findViewById(R.id.button_notice_home);
        menu = (ImageButton) findViewById(R.id.button_notice_menu);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_MainActivity);
            }
        });
    }
}