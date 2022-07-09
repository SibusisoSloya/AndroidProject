package com.example.psychtrackapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class signIn_page extends AppCompatActivity {


    Button btnSignin_id;
    TextInputLayout username_id;
    TextInputLayout password_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);
        btnSignin_id=findViewById(R.id.signInbutton_id);

        btnSignin_id.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                OpenJournal();
            }
        });
    }
    public void OpenJournal(){



        Intent intent=new Intent(signIn_page.this,MainActivity.class);
        startActivity(intent);
    }

}