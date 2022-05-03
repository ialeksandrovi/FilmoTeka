package com.axwel.storage

import com.axwel.data.Film
import com.axwel.data.Filter

interface FilmsStorage {
    fun getFilms(filter: Filter): List<Film>
    fun getFilm(id: String): Film
}