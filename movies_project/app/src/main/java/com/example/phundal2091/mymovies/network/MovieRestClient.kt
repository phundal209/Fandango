package com.example.phundal2091.mymovies.network

import com.example.phundal2091.mymovies.models.InTheatresResponse
import com.example.phundal2091.mymovies.models.MovieQueryResponse
import com.example.phundal2091.mymovies.models.MovieReviewsResponse
import com.example.phundal2091.mymovies.models.UpcomingMoviesResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieRestClient {

    @GET("lists/movies/in_theaters.json")
    fun getInTheatreMovies(@Query("apikey") apiKey : String,
                           @Query("page_limit") pageLimit : Int) : Single<InTheatresResponse>

    @GET("lists/movies/upcoming.json")
    fun getUpcomingMovies(@Query("apikey") apiKey : String) : Single<UpcomingMoviesResponse>


    @GET("movies/770672122/reviews.json")
    fun getMovieReviews(@Query("apikey") apiKey : String) : Single<MovieReviewsResponse>


    @GET("movies.json")
    fun getMovieByQuery(@Query("apikey") apiKey : String,
                        @Query("q") query : String) : Single<MovieQueryResponse>

}