package com.example.psychtrackapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.psychtrackapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar=getSupportActionBar();
        actionBar.setTitle("PsychTrack");





        replaceFragment(new DailyJournalFragment());
        binding.bottomNavigationView.setOnItemSelectedListener(item->{
           switch (item.getItemId())
           {
               case R.id.Routine:
                   replaceFragment(new DailyTaskFragment());
                   break;
               case R.id.Journal:
                   replaceFragment(new DailyJournalFragment());
                   break;
               case R.id.Task:
                   replaceFragment(new DailyTaskFragment());
                   break;
               case R.id.Appointment_id:
                   replaceFragment(new AppointmentFragment());
                   break;

           }
           return true;

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.action_bar,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.gratitude:

                break;
            case R.id.feedback:

                break;
            case R.id.Setting:

                break;


        }

        return super.onOptionsItemSelected(item);
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout_Container,fragment);
        fragmentTransaction.commit();

    }
}