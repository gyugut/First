package com.example.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;


public class RegisterActivity extends AppCompatActivity {

    private EditText Register_ID, Register_PW, Register_Name; //회원가입 입력필드
    private Button Register_Button;

    private FirebaseAuth regFirebaseAuth; // 파이어 베이스 인증
    private DatabaseReference regDatabaseRef; //실시간 데이터 베이스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regFirebaseAuth = FirebaseAuth.getInstance();
        regDatabaseRef = FirebaseDatabase.getInstance().getReference();

        Register_ID = (EditText)findViewById(R.id.editText_ID_register);
        Register_PW = (EditText)findViewById(R.id.editText_PW_register);
        Register_Name = (EditText)findViewById(R.id.editTextText_Name_register);
        Register_Button = (Button) findViewById(R.id.button_Register_register);
        Register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //회원가입 처리 시작;
                String Id, Password, Name;
                Id = Register_ID.getText().toString();
                Password = Register_PW.getText().toString();
                Name = Register_Name.getText().toString();

                //Firebase Auth start
                regFirebaseAuth.createUserWithEmailAndPassword(Id, Password).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) { // 가입 성공시
                        if(task.isSuccessful()){
                            FirebaseUser firebaseUser = regFirebaseAuth.getCurrentUser();
                        }
                    }
                });
                Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다", Toast.LENGTH_LONG);
                Intent intent_LoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent_LoginActivity);

            }
        });

    }
}