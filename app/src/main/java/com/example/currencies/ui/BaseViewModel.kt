package com.example.currencies.ui

import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent

abstract class BaseViewModel : ViewModel(), KoinComponent {
    // TODO: Implement the ViewModel
    open fun onStart() {}
}