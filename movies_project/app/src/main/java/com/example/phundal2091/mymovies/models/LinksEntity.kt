package com.example.phundal2091.mymovies.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LinksEntity(
        @Expose
        @SerializedName("self")
        val mSelf: String,
        @Expose
        @SerializedName("alternate")
        val mAlternate: String,
        @Expose
        @SerializedName("cast")
        val mCast: String,
        @Expose
        @SerializedName("reviews")
        val mReviews: String,
        @Expose
        @SerializedName("similar")
        val mSimilar: String)