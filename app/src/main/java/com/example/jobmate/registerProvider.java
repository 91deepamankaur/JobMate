package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerProvider extends AppCompatActivity {
    private Button button;
    EditText e1,e2,e3,e4,e5,e6;
    databaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_provider);
        db = new databaseHelper(this);
        e1 = (EditText)findViewById(R.id.email);
        e2= (EditText)findViewById(R.id.fname);
        e3= (EditText)findViewById(R.id.lname);
        e4= (EditText)findViewById(R.id.password);
        e5= (EditText)findViewById(R.id.rpassword);
        e6= (EditText)findViewById(R.id.caname);
        button=(Button)findViewById(R.id.register);
        AddData();
    }
    public void AddData(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=db.insertData(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString(),e6.getText().toString());
                if(isInserted==true)
                    Toast.makeText(registerProvider.this,"Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(registerProvider.this,"Data is not inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
}
