package com.janardhan_y.popular_movies_master.models;

import java.util.List;

public class MovieListResult {
    private List<Movie> results;

    public List<Movie> getMovieList() {
        return results;
    }

    public void setMovieList(List<Movie> movieList) {
        results = movieList;
    }
}
