package com.example.jobmate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddedJobsProvider extends AppCompatActivity {
    databaseHelper db;
    Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_jobs_provider);
    }
}

  /*  private void ViewAll() {
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=db.ViewData();
                if(res.getCount()==0){
                    showMessage("error","Nothing found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("ID: "
                            +res.getString(0)+"\n");
                    buffer.append("FIRSTNAME: " +res.getString(1)+"\n");
                    buffer.append("LASTNAME: " +res.getString(2)+"\n");
                    buffer.append("PASSWORD: " +res.getString(3)+"\n");

                }

                showMessage("data",buffer.toString());
            }
        });
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }


}*///