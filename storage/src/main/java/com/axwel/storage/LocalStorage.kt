package com.axwel.storage

import com.axwel.data.Film
import com.axwel.data.Filter

class LocalStorage: FilmsStorage {
    private val films: List<Film> = listOf()
    override fun getFilms(filter: Filter): List<Film> {
        return films.filter {
            it.title == filter.title
        }
    }

    override fun getFilm(id: String): Film {
        return films.first { it.id == id }
    }
}