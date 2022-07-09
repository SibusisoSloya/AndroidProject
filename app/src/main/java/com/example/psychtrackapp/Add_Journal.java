package com.example.psychtrackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Add_Journal extends AppCompatActivity {

    FloatingActionButton btnproceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journal);


        btnproceed=findViewById(R.id.journalfab);

        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceed();
            }
        });

    }
    private void proceed(){

        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}