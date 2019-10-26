package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PostJob extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6;
    private Button button;
    databaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);
        db = new databaseHelper(this);
        e1 = (EditText)findViewById(R.id.caname);
        e2= (EditText)findViewById(R.id.des);
        e3= (EditText)findViewById(R.id.salary);
        e4= (EditText)findViewById(R.id.phonenumber);
        e5= (EditText)findViewById(R.id.type);
        button=(Button)findViewById(R.id.add);
        AddData();
    }
    public void AddData(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=db.insertDataJ(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString());
                if(isInserted==true)
                    Toast.makeText(PostJob.this,"Job Posted Successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(PostJob.this,"Job is not Posted",Toast.LENGTH_LONG).show();
            }
        });

    }
}
