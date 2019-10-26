package com.example.jobmate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class profileProvider extends AppCompatActivity {
    private Button view;
    EditText editfname, editlname, editemail, editpass;
    databaseHelper db;
    private Button btnchangepass;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_provider);
        view = (Button) findViewById(R.id.view);
        editfname = (EditText) findViewById(R.id.fname);
        editlname = (EditText) findViewById(R.id.lname);
        editemail = (EditText) findViewById(R.id.email);
        editpass = (EditText) findViewById(R.id.password);
        btnchangepass = (Button) findViewById(R.id.chgpass);
        btnchangepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileProvider.this, changepasswordP.class);
                startActivity(intent);
            }
        });
       /* ViewAll();
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileProvider.this, PostJob.class);
                startActivity(intent);
            }
        });*/
    }
}
        /*private void ViewAll() {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Cursor res = db.ViewData();
                    if (res.getCount() == 0) {
                        showMessage("error", "Nothing found");
                        return;
                    }
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()) {
                        buffer.append("ID: "
                                + res.getString(0) + "\n");
                        buffer.append("EMAIL ID: " + res.getString(1) + "\n");
                        buffer.append("FIRSTNAME: " + res.getString(2) + "\n");
                        buffer.append("LASTNAME: " + res.getString(3) + "\n");
                        buffer.append("PASSWORD: " + res.getString(4) + "\n");

                    }
                    showMessage("data",buffer.toString());
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

      /*  private void ViewAll() {
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
                        Toast.makeText(profileProvider.this,"Data is inserted successfully",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(profileProvider.this,"Data is not inserted",Toast.LENGTH_LONG).show();
                }
            });
        }


        public void showMessage(String title, String Message) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(Message);
            builder.show();



            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(profileProvider.this,loginProvider.class);
                startActivity(intent);
            }
        });
    }
}

*/