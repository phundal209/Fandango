package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class PostersEntity(
        @Expose
        @SerializedName("thumbnail")
        val mThumbnail: String,
        @Expose
        @SerializedName("profile")
        val mProfile: String,
        @Expose
        @SerializedName("detailed")
        val mDetailed: String,
        @Expose
        @SerializedName("original")
        val mOriginal: String)