package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class ReleaseDatesEntity(
        @Expose
        @SerializedName("theater")
        val mTheater: String)