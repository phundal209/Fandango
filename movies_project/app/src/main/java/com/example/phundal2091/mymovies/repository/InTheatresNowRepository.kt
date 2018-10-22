package com.example.phundal2091.mymovies.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.phundal2091.mymovies.models.MoviesEntity
import com.example.phundal2091.mymovies.network.MovieApi
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

class InTheatresNowRepository {

    private val inTheatresLiveData : MutableLiveData<List<MoviesEntity>> = MutableLiveData()
    private val pageLimit = 25

    fun getInTheatresMovies() : LiveData<List<MoviesEntity>>{
        MovieApi.getMoviesInTheatresNow(pageLimit)
                .subscribeOn(Schedulers.io())
                .subscribe({
                    inTheatresLiveData.postValue(it.movies)
                }, {
                    Log.e(InTheatresNowRepository::class.java.simpleName, "error = " + it.message)
                })!!
        return inTheatresLiveData
    }
}