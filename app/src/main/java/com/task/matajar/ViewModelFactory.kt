package com.task.matajar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.task.matajar.repository.Repository
import com.task.matajar.viewModel.MainViewModel

class ViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}