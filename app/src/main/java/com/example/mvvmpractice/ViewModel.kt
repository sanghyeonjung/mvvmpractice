package com.example.mvvmpractice

import android.app.Application
import androidx.lifecycle.MutableLiveData

class ViewModel(application: Application) :androidx.lifecycle.ViewModel() {
    var text = MutableLiveData<String>()
    init{
        text.value = ""
    }
}