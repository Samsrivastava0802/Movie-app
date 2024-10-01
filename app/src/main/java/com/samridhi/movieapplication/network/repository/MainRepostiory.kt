package com.samridhi.movieapplication.network.repository

import com.samridhi.movieapplication.network.api.MovieApiInterface
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api: MovieApiInterface
) {
    suspend fun getMovieData() = api.getMovie()
}
