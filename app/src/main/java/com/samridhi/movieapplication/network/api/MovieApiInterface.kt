package com.samridhi.movieapplication.network.api

import com.samridhi.movieapplication.network.model.Movies
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("movie/157336?api_key=")
      suspend fun getMovie(
      ): Movies
}