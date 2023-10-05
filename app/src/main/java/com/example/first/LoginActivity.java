package com.example.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText Login_ID, Login_PW;
    private Button Login_Button, Register_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login_ID = (EditText)findViewById(R.id.editText_ID);
        Login_PW = (EditText)findViewById(R.id.editText_PW);
        Login_Button = (Button) findViewById(R.id.button_Login);
        Register_Button = (Button) findViewById(R.id.button_Register);
        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Id, Password, Name;
                Id = Login_ID.getText().toString();
                Password = Login_PW.getText().toString();

                Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_LONG);
                Intent intent_MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_MainActivity);
            }
        });

        Register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_RegisterActivity = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent_RegisterActivity);
            }
        });
    }
}