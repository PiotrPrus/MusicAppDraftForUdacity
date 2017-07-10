package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonOnClick(View view) {
    }

    public void openAlbumInfoActivity(View view) {
        Intent albumInfoIntent = new Intent(this, AlbumInfoActivity.class);
        startActivity(albumInfoIntent);
    }

    public void openAboutArtistActivity(View view) {
        Intent artistInfoIntent = new Intent(this, ArtistInfoActivity.class);
        startActivity(artistInfoIntent);
    }

    public void openMusicStoreActivity(View view) {
    }
}
