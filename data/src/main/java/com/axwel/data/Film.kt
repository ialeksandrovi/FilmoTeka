package com.axwel.data

import java.util.*

data class Film(
        val id: String,
        val title: String,
        val releaseDate: Date,
        val description: String,
        val rating: Double,
        val actors: List<Actor>
)