package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class MoviesEntity(
        @Expose
        @SerializedName("id")
        val mId: String,
        @Expose
        @SerializedName("title")
        val mTitle: String,
        @Expose
        @SerializedName("year")
        var mYear: Integer,
        @Expose
        @SerializedName("mpaa_rating")
        val mMpaaRating: String,
        @Expose
        @SerializedName("runtime")
        var mRuntime: Integer,
        @Expose
        @SerializedName("critics_consensus")
        val mCriticsConsensus: String,
        @Expose
        @SerializedName("release_dates")
        var mReleaseDates: ReleaseDatesEntity,
        @Expose
        @SerializedName("ratings")
        var mRatings: RatingsEntity,
        @Expose
        @SerializedName("synopsis")
        val mSynopsis: String,
        @Expose
        @SerializedName("posters")
        var mPosters: PostersEntity,
        @Expose
        @SerializedName("abridged_cast")
        var mAbridgedCastEntity: List<AbridgedCastEntity>,
        @Expose
        @SerializedName("links")
        var mLinks: LinksEntity)