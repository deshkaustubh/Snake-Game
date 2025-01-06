package com.example.snakegame

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

// Logic and State Management
class SnakeGameViewModel: ViewModel() {
    private val _state = MutableStateFlow(SnakeGameState())
    val state = _state.asStateFlow()
}