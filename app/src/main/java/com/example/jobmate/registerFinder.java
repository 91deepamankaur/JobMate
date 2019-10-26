package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Year;
import java.util.Calendar;

public class registerFinder extends AppCompatActivity {
    private static final String TAG="registerFinder";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private Button button;
    private Button button1;
    EditText e1,e2,e3,e4,e5,e6;
    databaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_finder);
        mDisplayDate=(TextView)findViewById(R.id.datebirth);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(registerFinder.this, android.R.style.Theme_Holo_Light_Dialog, mDateSetListener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Log.d(TAG,"OnDateSet:date:"+i+"/"+i1+"/"+i2);
            }
        };
        db = new databaseHelper(this);
        e1 = (EditText)findViewById(R.id.email);
        e2= (EditText)findViewById(R.id.fname);
        e3= (EditText)findViewById(R.id.lname);
        e4= (EditText)findViewById(R.id.password);
        e5= (EditText)findViewById(R.id.rpassword);
        e6= (EditText) findViewById(R.id.datebirth);
        button1=(Button)findViewById(R.id.register);
        AddData();
    }
    public void AddData(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=db.insertDataF(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString(),e6.getText().toString());
                if(isInserted==true)
                    Toast.makeText(registerFinder.this,"Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(registerFinder.this,"Data is not inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
}
