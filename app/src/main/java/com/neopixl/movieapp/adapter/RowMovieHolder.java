package com.neopixl.movieapp.adapter;

import android.view.View;
import android.widget.TextView;

import com.neopixl.movieapp.R;
import com.neopixl.movieapp.model.Movie;

public class RowMovieHolder {

    private final TextView textViewMovieTitle;

    public RowMovieHolder(View view) {
        textViewMovieTitle = (TextView) view.
                findViewById(R.id.row_movie_title_textview);

    }

    public void refreshWithMovie(Movie movie) {
        textViewMovieTitle.setText(movie.getTitle());
    }


}
