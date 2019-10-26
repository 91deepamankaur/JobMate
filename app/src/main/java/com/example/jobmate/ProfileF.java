package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileF extends AppCompatActivity {
    ImageView profile;
    ImageView home;
    ImageView search;
    ImageView saved;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_f);
        logout=(Button)findViewById(R.id.logout) ;
        home=(ImageView)findViewById(R.id.home);
        saved=(ImageView)findViewById(R.id.saved);
        search=(ImageView)findViewById(R.id.search);
        profile=(ImageView)findViewById(R.id.profile);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileF.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileF.this, PostJob.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileF.this,MainActivity.class);
                startActivity(intent);
            }
        });
        saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileF.this,viewModifyAdded.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileF.this,AddedJobsProvider.class);
                startActivity(intent);
            }
        });
    }
}
