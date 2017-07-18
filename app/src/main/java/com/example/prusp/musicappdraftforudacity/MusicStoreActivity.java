package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MusicStoreActivity extends AppCompatActivity {

    public Button backToListeningButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);
        initButton();
    }

    public void initButton() {
        backToListeningButton = (Button) findViewById(R.id.back_to_listening_button2);
        backToListeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(MusicStoreActivity.this, MainActivity.class);
                startActivity(backToMainIntent);
            }
        });

    }
}
