package com.example.first;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public static final int MAIN_ACTIVITY_CODE = 1;
    public static final int SUPPORT_ACTIVITY_CODE = 2;
    public static final int SUPPORTMENU_ACTIVITY_CODE = 3;
    public static final int RESERVE_ACTIVITY_CODE = 4;
    public static final int PROFILE_ACTIVITY_CODE = 5;
    public static final int RESERVELOG_ACTIVITY_CODE = 6;
    public static final int NOTICE_ACTIVITY_CODE = 7;

    private ImageButton home, menu;
    private Button profile, setting, notice, search, support;
    private TextView privactivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        home = (ImageButton) findViewById(R.id.button_supportmenu_home);
        menu = (ImageButton) findViewById(R.id.button_supportmenu_menu);
        profile = (Button) findViewById(R.id.button_menu_profile);
        setting = (Button) findViewById(R.id.button_menu_setting);
        notice = (Button) findViewById(R.id.button_menu_notice);
        search = (Button) findViewById(R.id.button_menu_search);
        support = (Button) findViewById(R.id.button_menu_support);
        privactivity = (TextView) findViewById(R.id.textView_menu_privactivity);

        int privActivityCode = getIntent().getIntExtra("privActivity", -1);

        switch (privActivityCode) {
            case MAIN_ACTIVITY_CODE:
                privactivity.setText("Empty Classroom");
                break;
            case SUPPORT_ACTIVITY_CODE:
            case SUPPORTMENU_ACTIVITY_CODE:
                privactivity.setText("Support");
                break;
            case PROFILE_ACTIVITY_CODE:
                privactivity.setText("Profile");
                break;
            case RESERVE_ACTIVITY_CODE:
                privactivity.setText("Reserve");
                break;
            case RESERVELOG_ACTIVITY_CODE:
                privactivity.setText("예약 내역");
                break;
            case NOTICE_ACTIVITY_CODE:
                privactivity.setText("Notice");
                break;
            default:
                privactivity.setText("Menu");
                break;
        }
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