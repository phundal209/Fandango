package com.example.phundal2091.mymovies.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.phundal2091.mymovies.R
import com.example.phundal2091.mymovies.adapter.InTheatresNowAdapter
import com.example.phundal2091.mymovies.view_models.InTheatresNowViewModel
import kotlinx.android.synthetic.main.in_theatres_now_fragment.*

class InTheatresNowFragment : Fragment() {

    private val numberOfMovieColmns = 3
    lateinit var inTheatresNowViewModel : InTheatresNowViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(InTheatresNowFragment::class.java.simpleName, "in theatres now fragment created")
        inTheatresNowViewModel = InTheatresNowViewModel.create(this)
        return layoutInflater.inflate(R.layout.in_theatres_now_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inTheatresRecyclerView.layoutManager = GridLayoutManager(context, numberOfMovieColmns)
        val adapter = context?.let { InTheatresNowAdapter(it, mutableListOf()) }
        inTheatresRecyclerView.adapter = adapter
        inTheatresNowViewModel.readInTheatresMovies().observe(this, Observer {
            adapter?.updateList(it)
        })
    }
}