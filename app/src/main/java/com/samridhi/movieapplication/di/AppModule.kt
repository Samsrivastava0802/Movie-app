package com.samridhi.movieapplication.di

import com.google.gson.GsonBuilder
import com.samridhi.movieapplication.network.api.MovieApiInterface
import com.samridhi.movieapplication.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

@Singleton
@Provides
 fun provideMovieApi() : MovieApiInterface =
     Retrofit.Builder()
         .baseUrl(Constant.BASE_URL)
         .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
         .build()
         .create(MovieApiInterface::class.java)
}