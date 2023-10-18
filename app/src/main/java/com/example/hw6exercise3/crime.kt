package com.example.hw6exercise3

import java.util.*



data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)