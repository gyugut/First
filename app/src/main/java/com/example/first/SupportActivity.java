package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

        submit = (Button) findViewById(R.id.button_Submit_Support);
        back = (Button) findViewById(R.id.button_Back_Support);
        home = (ImageButton) findViewById(R.id.button_Home_Support);
        menu = (ImageButton) findViewById(R.id.button_Menu_Support);
        Supportcontent = (EditText) findViewById(R.id.editText_Support_Support);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Support_Content;
                Support_Content = Supportcontent.getText().toString();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}