package com.example.phundal2091.mymovies.view_models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.phundal2091.mymovies.models.MoviesEntity
import com.example.phundal2091.mymovies.repository.InTheatresNowRepository
import androidx.lifecycle.ViewModelProviders
import com.example.phundal2091.mymovies.views.InTheatresNowFragment


class InTheatresNowViewModel(application: Application) : AndroidViewModel(application) {
    private val inTheatresRepo = InTheatresNowRepository()

    companion object {
        fun create(fragment: InTheatresNowFragment) : InTheatresNowViewModel{
           return ViewModelProviders.of(fragment).get(InTheatresNowViewModel::class.java)
        }
    }

    fun readInTheatresMovies() : LiveData<List<MoviesEntity>> = inTheatresRepo.getInTheatresMovies()
}