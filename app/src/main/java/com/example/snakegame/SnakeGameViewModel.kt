package com.example.snakegame

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.Currency

// Logic and State Management
class SnakeGameViewModel: ViewModel() {
    private val _state = MutableStateFlow(SnakeGameState())
    val state = _state.asStateFlow()

    fun onEvent(event: SnakeGameEvent) {
        when(event) {
            SnakeGameEvent.StartGame -> TODO()
            SnakeGameEvent.PauseGame -> {
                _state.update { it.copy(gameState = GameState.PAUSED) }
            }
            SnakeGameEvent.ResetGame -> {
                _state.value = SnakeGameState()
            }
            is SnakeGameEvent.UpdateDirection -> TODO()
        }

        private fun updateGame(currentGame: SnakeGameState): SnakeGameState{
            if (currentGame.isGameOver) {
                return currentGame
            }

            val head = currentGame.snake.first()
            val xAxisGridSize = currentGame.xAxisGridSize
            val yAxisGridSize = currentGame.yAxisGridSize

            // Update Movement of Snake
            val newHead = when(currentGame.direction) {
                Direction.UP -> Coordinate(x = head.x , y = (head.y - 1))
                Direction.DOWN -> Coordinate(x = head.x , y = (head.y + 1))
                Direction.LEFT -> Coordinate(x = (head.x - 1) , y = (head.y))
                Direction.RIGHT -> Coordinate(x = (head.x + 1) , y = (head.y))
            }

            // Check if the snake Collides with itself or goes out of bounds
            if (
                currentGame.snake.contains(newHead) ||
            )
        }
    }
}