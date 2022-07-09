package com.example.psychtrackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class mood_chart extends AppCompatActivity {

    FloatingActionButton Btnproceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_chart);

        Btnproceed=findViewById(R.id.fabproceed);

        Btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddJournalPage();
            }
        });


    }
    private void AddJournalPage(){

        Intent in=new Intent(this,Add_Journal.class);
        startActivity(in);
    }
}