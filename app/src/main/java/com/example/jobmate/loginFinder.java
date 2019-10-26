package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginFinder extends AppCompatActivity {
    EditText e1, e2;
    private Button button;
    private Button button1;
    databaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_finder);
        button=(Button)findViewById(R.id.b2);
        button1=(Button)findViewById(R.id.b1);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(loginFinder.this, registerFinder.class);
                        startActivity(intent);
                    }
                });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginFinder.this, ProfileF.class);
                startActivity(intent);
            }
        });

            }
        }
