package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SupportActivity extends AppCompatActivity {

    private Button submit, back;
    private ImageButton home, menu;
    private EditText Supportcontent;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        submit = (Button) findViewById(R.id.button_support_submit);
        back = (Button) findViewById(R.id.button_support_back);
        home = (ImageButton) findViewById(R.id.button_support_home);
        menu = (ImageButton) findViewById(R.id.button_support_menu);
        Supportcontent = (EditText) findViewById(R.id.editText_support_support);

        Intent intent = getIntent();
        String SupportType = intent.getStringExtra("SupportType");
        //appmalfunc = 앱 작동 오류, diffclass = 강의실 정보 상이, repotruser = 이용자 신고, facilitymaint = 시설 관리

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Support_Content;
                Support_Content = Supportcontent.getText().toString();
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}