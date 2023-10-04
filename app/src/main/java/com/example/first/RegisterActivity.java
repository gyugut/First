package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;


public class RegisterActivity extends AppCompatActivity {

    private EditText Register_ID, Register_PW, Register_Name;
    private Button Register_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Register_ID = (EditText)findViewById(R.id.editText_ID_register);
        Register_PW = (EditText)findViewById(R.id.editText_PW_register);
        Register_Name = (EditText)findViewById(R.id.editTextText_Name_register);
        Register_Button = (Button) findViewById(R.id.button_Register_register);
        Register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Id, Password, Name;
                Id = Register_ID.getText().toString();
                Password = Register_PW.getText().toString();
                Name = Register_Name.getText().toString();

                Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다", Toast.LENGTH_LONG);
                Intent intent_LoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent_LoginActivity);

            }
        });

    }
}