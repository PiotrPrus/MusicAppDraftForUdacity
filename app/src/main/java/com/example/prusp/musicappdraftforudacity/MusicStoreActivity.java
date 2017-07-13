package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MusicStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);
    }

    public void backToMainActivity(View view) {
        Intent backToMainIntent = new Intent(this, MainActivity.class);
        startActivity(backToMainIntent);
    }
}
