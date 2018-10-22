package com.example.phundal2091.mymovies.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phundal2091.mymovies.R
import com.example.phundal2091.mymovies.models.MoviesEntity

class InTheatresNowAdapter(val context : Context, private val inTheatresMovies : MutableList<MoviesEntity>) : RecyclerView.Adapter<InTheatresNowAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val vh = LayoutInflater.from(parent.context).inflate(R.layout.in_theatres_movie_item, parent, false)
        return ViewHolder(vh)
    }

    override fun getItemCount(): Int = inTheatresMovies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val moviesModel = inTheatresMovies[position]
        moviesModel.let {
            holder.bind(it)
        }
    }

    fun updateList(movieEntities : List<MoviesEntity>) {
        inTheatresMovies.addAll(movieEntities)
        notifyDataSetChanged()
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val movieTitle = view.findViewById<TextView>(R.id.movieTitle) as TextView
        val thumbnail = view.findViewById<ImageView>(R.id.thumbnail) as ImageView
        val movieCritics = view.findViewById<TextView>(R.id.movieCritics) as TextView
        val movieRating = view.findViewById<TextView>(R.id.movieRating) as TextView
        val synopsis = view.findViewById<TextView>(R.id.synopsis) as TextView

        fun bind(model : MoviesEntity) {
            movieTitle.text = model.mTitle
            movieCritics.text = model.mCriticsConsensus
            movieRating.text = model.mMpaaRating
            synopsis.text = model.mSynopsis
        }
    }
}