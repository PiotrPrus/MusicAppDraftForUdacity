package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistInfoActivity extends AppCompatActivity {

    public Button openOfficialPageButton;
    public Button backToListeningButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_info);
        initButtons();
    }

    private void initButtons() {
        initOpenOfficialPageButton();
        initBackToListeningButton();
    }

    private void initBackToListeningButton() {
        backToListeningButton = (Button)findViewById(R.id.back_to_listening_button);
        backToListeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(ArtistInfoActivity.this, MainActivity.class);
                startActivity(backToMainIntent);
            }
        });
    }

    private void initOpenOfficialPageButton() {
        openOfficialPageButton = (Button)findViewById(R.id.official_page_button);
        openOfficialPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPageIntent = new Intent(Intent.ACTION_VIEW);
                openPageIntent.setData(Uri.parse("http://www.acdc.com/"));
                startActivity(openPageIntent);
            }
        });
    }
}
