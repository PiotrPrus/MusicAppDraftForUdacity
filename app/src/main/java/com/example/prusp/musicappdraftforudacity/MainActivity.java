package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView artistNameTextView;
    public ImageView artistCoverImageView;
    public ImageButton musicStoreImageButton;

    private boolean isDrawableAPauseIcon=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initClickableViews();
    }

    private void initClickableViews() {
        initClickableArtistTextView();
        initClickableCoverImageView();
        initClickableMusicStoreImageButton();
    }

    private void initClickableMusicStoreImageButton() {
        musicStoreImageButton = (ImageButton)findViewById(R.id.music_store_image_button);
        musicStoreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, MusicStoreActivity.class);
                startActivity(musicStoreIntent);
            }
        });
    }

    private void initClickableCoverImageView() {
        artistCoverImageView = (ImageView)findViewById(R.id.album_cover_image_view);
        artistCoverImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumInfoIntent = new Intent(MainActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });
    }

    private void initClickableArtistTextView() {
        artistNameTextView = (TextView)findViewById(R.id.artist_name_text_view);
        artistNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistInfoIntent = new Intent(MainActivity.this, ArtistInfoActivity.class);
                startActivity(artistInfoIntent);
            }
        });
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
}
