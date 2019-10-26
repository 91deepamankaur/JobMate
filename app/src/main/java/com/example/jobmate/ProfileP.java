package com.example.jobmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileP extends AppCompatActivity {
    ImageView profile;
    ImageView home;
    ImageView search;
    ImageView add;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_p);
        home=(ImageView)findViewById(R.id.home);
        search=(ImageView)findViewById(R.id.search);
        profile=(ImageView)findViewById(R.id.profile);
        profile=(ImageView)findViewById(R.id.profile);
        add=(ImageView)findViewById(R.id.add);
        logout=(Button)findViewById(R.id.logout) ;
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileP.this, MainActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileP.this, profileProvider.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileP.this,MainActivity.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileP.this,AddedJobsProvider.class);
                startActivity(intent);
            }
        });
    }
}
