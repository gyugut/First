package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SupportmenuActivity extends AppCompatActivity {

    private Button appmalfunc, diffclass, reportuser, facilitymaint;
    private ImageButton home, menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supportmenu);

        appmalfunc = (Button) findViewById(R.id.button_supportmenu_appmalfunc);
        diffclass = (Button) findViewById(R.id.button_supportmenu_diffclass);
        reportuser = (Button) findViewById(R.id.button_supportmenu_reportuser);
        facilitymaint = (Button) findViewById(R.id.button_supportmenu_facilitymaint);
        home = (ImageButton) findViewById(R.id.button_menu_home);
        menu = (ImageButton) findViewById(R.id.button_menu_menu);

        appmalfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportActivity = new Intent(getApplicationContext(), SupportActivity.class);
                intent_SupportActivity.putExtra("SupportType", "appmalfunc");
                finish();
                startActivity(intent_SupportActivity);
            }
        });

        diffclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportActivity = new Intent(getApplicationContext(), SupportActivity.class);
                intent_SupportActivity.putExtra("SupportType", "diffclass");
                finish();
                startActivity(intent_SupportActivity);
            }
        });

        reportuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportActivity = new Intent(getApplicationContext(), SupportActivity.class);
                intent_SupportActivity.putExtra("SupportType", "repotruser");
                finish();
                startActivity(intent_SupportActivity);
            }
        });

        facilitymaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_SupportActivity = new Intent(getApplicationContext(), SupportActivity.class);
                intent_SupportActivity.putExtra("SupportType", "facilitymaint");
                finish();
                startActivity(intent_SupportActivity);
            }
        });

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
    }
}