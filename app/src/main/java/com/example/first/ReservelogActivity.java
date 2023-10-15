package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ReservelogActivity extends AppCompatActivity {
    ImageButton home, menu;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservelog);

        home = (ImageButton) findViewById(R.id.button_reservelog_home);
        menu = (ImageButton) findViewById(R.id.button_reservelog_menu);
        back = (Button) findViewById(R.id.button_reservelog_back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ProfileActivity = new Intent(getApplicationContext(), ProfileActivity.class);
                finish();
                startActivity(intent_ProfileActivity);
            }
        });
    }
}