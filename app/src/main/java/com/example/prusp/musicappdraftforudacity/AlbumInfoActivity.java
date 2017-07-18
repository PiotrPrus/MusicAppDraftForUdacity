package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumInfoActivity extends AppCompatActivity {

    public Button backToListeningButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_info);
        initButton();
    }

    public void initButton() {
        backToListeningButton = (Button) findViewById(R.id.back_to_listening_button3);
        backToListeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(AlbumInfoActivity.this, MainActivity.class);
                startActivity(backToMainIntent);
            }
        });

    }
}
