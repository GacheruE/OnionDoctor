package com.example.oniondoctor.bottomActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.oniondoctor.PestsActivity;
import com.example.oniondoctor.R;
import com.example.oniondoctor.mainPageActivity.OnionDiseaseDetection;

public class MainActivity extends AppCompatActivity {

    RelativeLayout pests;
    Button detectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        pests = findViewById(R.id.pests);
        pests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PestsActivity.class));
            }
        });


        detectBtn = findViewById(R.id.detectBtn);

        detectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OnionDiseaseDetection.class));
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}