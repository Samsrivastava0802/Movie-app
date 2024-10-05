package com.samridhi.movieapplication.main.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samridhi.movieapplication.network.model.Movies
import com.samridhi.movieapplication.network.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(private val repository: MainRepository) : ViewModel() {

    private val _movieData: MutableLiveData<Movies> = MutableLiveData()
    val movieData: LiveData<Movies> get() = _movieData

    private fun getMovieData() {
        viewModelScope.launch {
            val result = repository.getMovieData()
            _movieData.value = result

        }
    }
}
