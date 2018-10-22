package com.example.phundal2091.mymovies.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class AbridgedCastEntity(
        @Expose
        @SerializedName("name")
        val mName: String,
        @Expose
        @SerializedName("id")
        val mId: String,
        @Expose
        @SerializedName("characters")
        var mCharacters: List<String>)