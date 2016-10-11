package com.janardhan_y.popular_movies_master.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.janardhan_y.popular_movies_master.R;
import com.janardhan_y.popular_movies_master.common.Constants;
import com.janardhan_y.popular_movies_master.fragments.MovieDetailActivityFragment;
import com.janardhan_y.popular_movies_master.models.Movie;


public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(Constants.MOVIE)) {
                if (savedInstanceState == null) {
                    MovieDetailActivityFragment movieDetailActivityFragment =
                            MovieDetailActivityFragment.newInstance((Movie) extras.getParcelable(Constants.MOVIE));
                    getSupportFragmentManager().beginTransaction().add(R.id.movie_detail_content, movieDetailActivityFragment).commit();
                }
            }
        }
    }
}
