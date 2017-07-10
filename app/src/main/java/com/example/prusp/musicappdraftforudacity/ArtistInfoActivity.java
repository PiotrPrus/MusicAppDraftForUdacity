package com.example.prusp.musicappdraftforudacity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArtistInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_info);
    }

    public void openOfficialArtistPage(View view) {
        Intent openPageIntent = new Intent(Intent.ACTION_VIEW);
        openPageIntent.setData(Uri.parse("http://www.acdc.com/"));
        startActivity(openPageIntent);
    }
}
