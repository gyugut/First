package com.example.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    private EditText Login_ID, Login_PW;
    private Button Login_Button, Register_Button;

    private FirebaseAuth logFirebaseAuth;
    private DatabaseReference logDatabaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logFirebaseAuth = FirebaseAuth.getInstance();
        logDatabaseRef = FirebaseDatabase.getInstance().getReference("EmptyClassroom");



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

                logFirebaseAuth.signInWithEmailAndPassword(Id, Password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "입력하신 정보가 옳지 않습니다.", Toast.LENGTH_LONG);
                        }
                    }
                });


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