package com.example.simplevent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class RegistrationActivity extends AppCompatActivity {

    EditText emailId, password;
    Button btnSignUp;
    TextView tvSignIn;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.edtEmail);
        password = findViewById(R.id.edtPass);
        btnSignUp = findViewById(R.id.signupButton);
        tvSignIn = findViewById(R.id.signIn_text);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailId.getText().toString();
                String pwd= password.getText().toString();
                if (email.isEmpty()) {
                    emailId.setError("Please enter email ID");
                    emailId.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(RegistrationActivity.this, "Fields Are Empty!", Toast.LENGTH_SHORT).show();
                }
                else if (!(email.isEmpty() && pwd.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd)
                            .addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                 if(!task.isSuccessful()){
                                     Toast.makeText(RegistrationActivity.this, "SignUp Unsuccesfull, Please Try Again", Toast.LENGTH_SHORT).show();
                                 }
                                 else {
                                     startActivity(new Intent(RegistrationActivity.this, DashboardActivity.class));
                                 }
                                }
                            });
                }
                else {
                    Toast.makeText(RegistrationActivity.this,"Error Occured", Toast.LENGTH_SHORT).show();
                }

            }
        });

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}
