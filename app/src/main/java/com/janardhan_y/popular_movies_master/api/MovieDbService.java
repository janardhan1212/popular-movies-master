package com.janardhan_y.popular_movies_master.api;

import com.janardhan_y.popular_movies_master.models.MovieListResult;
import com.janardhan_y.popular_movies_master.models.ReviewListResult;
import com.janardhan_y.popular_movies_master.models.TrailerListResult;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by maximyudin on 25.06.15.
 */
public interface MovieDbService {
    String API_KEY_PAIR = "api_key=33eecb95aa60a90830901aa5772ecad0"; // insert instead 'your_key' your api key
    String PARAM_SORT_BY = "sort_by";

    @GET("/discover/movie?primary_release_year=2015&vote_count.gte=50&" + API_KEY_PAIR)
    MovieListResult getMovieList(@Query(PARAM_SORT_BY) String sortBy);

    @GET("/movie/{id}/videos?" + API_KEY_PAIR)
    TrailerListResult getTrailerList(@Path("id") String movieId);

    @GET("/movie/{id}/reviews?" + API_KEY_PAIR)
    ReviewListResult getReviewList(@Path("id") String movieId);
}
