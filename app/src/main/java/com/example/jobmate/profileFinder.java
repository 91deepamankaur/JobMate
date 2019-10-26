package com.example.jobmate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profileFinder extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6;
    private Button button;
    EditText editfname, editlname, editmarks, editemail, editpass, editstaff;
    private Button btnchangepass;
    databaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_finder);
        editfname = (EditText) findViewById(R.id.fname);
        editlname = (EditText) findViewById(R.id.lname);
        editemail = (EditText) findViewById(R.id.email);
        editpass = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.logout);
        btnchangepass = (Button) findViewById(R.id.chgpass);
        btnchangepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileFinder.this, changepasswordf.class);
                startActivity(intent);
            }
        });
    }
}
/*
    private void ViewAll() {
        Cursor res = db.ViewData();
        if (res.getCount() == 0) {
            showMessage("error", "Nothing found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append("ID: "
                    + res.getString(0) + "\n");
            buffer.append("FIRSTNAME: " + res.getString(1) + "\n");
            buffer.append("LASTNAME: " + res.getString(2) + "\n");
            buffer.append("PASSWORD: " + res.getString(3) + "\n");

        }
        showMessage("data", buffer.toString());


    }
    private void AddData(){
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isinserted=db.insertData(editfname.getText().toString(),editlname.getText().toString(),editemail.getText().toString(),editpass.getText().toString());
                if(isinserted==true)
                    Toast.makeText(profileFinder.this,"Data is inserted successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(profileFinder.this,"Data is not inserted",Toast.LENGTH_LONG).show();
            }
        });
    }


    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();


    }
}

*/
