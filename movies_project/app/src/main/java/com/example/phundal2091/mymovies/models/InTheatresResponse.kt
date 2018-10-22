package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class InTheatresResponse(
                                @Expose
                                @SerializedName("total") val total : Int,
                                @Expose
                                @SerializedName("movies") val movies : List<MoviesEntity>)