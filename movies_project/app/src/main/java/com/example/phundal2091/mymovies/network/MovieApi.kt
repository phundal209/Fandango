package com.example.phundal2091.mymovies.network

import com.example.phundal2091.mymovies.models.InTheatresResponse
import com.example.phundal2091.mymovies.models.MovieQueryResponse
import com.example.phundal2091.mymovies.models.UpcomingMoviesResponse
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

object MovieApi {
    private val retrofit : Retrofit = RetrofitBuildr().buildRetrofit()
    private val movieRestClient : MovieRestClient = retrofit.create(MovieRestClient::class.java)
    private val api_key = "wcvp8m6gtytxap9mn82febm2"

    fun getMoviesInTheatresNow(pageLimit : Int) : Single<InTheatresResponse> =  movieRestClient.getInTheatreMovies(api_key, pageLimit)

    fun getUpcomingMovies() : Single<UpcomingMoviesResponse> = movieRestClient.getUpcomingMovies(api_key)

    fun getMoviesByQuery(query : String) : Single<MovieQueryResponse> = movieRestClient.getMovieByQuery(api_key, query)
}