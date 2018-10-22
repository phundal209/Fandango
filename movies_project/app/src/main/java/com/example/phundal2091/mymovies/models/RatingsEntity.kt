package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class RatingsEntity(
        @Expose
        @SerializedName("critics_rating")
        val mCriticsRating: String,
        @Expose
        @SerializedName("critics_score")
        var mCriticsScore: Integer,
        @Expose
        @SerializedName("audience_rating")
        val mAudienceRating: String,
        @Expose
        @SerializedName("audience_score")
        var mAudienceScore: Integer)