package com.neopixl.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.neopixl.movieapp.adapter.MoviesAdapter;
import com.neopixl.movieapp.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Alien"));
        movies.add(new Movie("Hunger games"));
        movies.add(new Movie("Harry Potter"));
        movies.add(new Movie("Twilight"));
        movies.add(new Movie("American Pie"));
        movies.add(new Movie("Star wars"));
        movies.add(new Movie("Terminator"));
        movies.add(new Movie("Titanic"));
        movies.add(new Movie("Le journal de Bridget Jones"));
        movies.add(new Movie("Mad Max"));
        movies.add(new Movie("Wall-e"));
        movies.add(new Movie("La vie est un long fleuve tranquille"));
        movies.add(new Movie("Tonnerre sous les tropiques"));
        movies.add(new Movie("C'est arrivé près de chez vous"));
        movies.add(new Movie("Dikkenek"));
        movies.add(new Movie("Maman j'ai raté l'avion."));


        // this = l'instance courante de MainActivity = sous-classe de Context
        MoviesAdapter moviesAdapter = new MoviesAdapter(this);
        moviesAdapter.refreshWithMovies(movies);

        ListView listView = (ListView) findViewById(R.id.movies_listview);

        listView.setAdapter(moviesAdapter);



    }
}
