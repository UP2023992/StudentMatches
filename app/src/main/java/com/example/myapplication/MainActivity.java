package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startClickHandler(View view){
        Intent myIntent = new Intent(FirstUIScreen.this, MainActivity.class);
        startActivity(myIntent);
        stopService(intent);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.werewolfhowl); //play sound effect
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.quest_click);
        mp.start();
        mp2.start();

    }
}
    //on click of start button
    public void startClickHandler(View view){
        Intent myIntent = new Intent(FirstUIScreen.this, MainActivity.class);
        startActivity(myIntent);
        stopService(intent);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.werewolfhowl); //play sound effect
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.quest_click);
        mp.start();
        mp2.start();

    }
}
