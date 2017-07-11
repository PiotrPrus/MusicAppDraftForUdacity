package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private boolean isDrawableAPauseIcon=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonOnClick(View view) {
        ImageButton playPauseButton = (ImageButton)findViewById(R.id.play_pause_button);
        if (isDrawableAPauseIcon) {
            playPauseButton.setImageResource(R.drawable.ic_play_circle_outline_white_48dp);
            isDrawableAPauseIcon=false;
        } else {
            playPauseButton.setImageResource(R.drawable.ic_pause_circle_outline_white_48dp);
            isDrawableAPauseIcon=true;
        }

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
        Intent musicStoreIntent = new Intent(this, MusicStoreActivity.class);
        startActivity(musicStoreIntent);
    }
}
