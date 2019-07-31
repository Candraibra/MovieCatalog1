package com.candraibra.moviecatalog1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            ImageView imgPoster = findViewById(R.id.img_poster);
            imgPoster.setImageResource(selectedMovie.getPoster());


            TextView txtJudul = findViewById(R.id.txt_judul);
            txtJudul.setText(selectedMovie.getJudul());

            TextView txtSinopsis = findViewById(R.id.txt_sinopsis);
            txtSinopsis.setText(selectedMovie.getSinopsis());

        }

    }
}
