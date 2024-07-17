package com.example.demo.adapters.controllers

import com.example.demo.domains.Movie
import com.example.demo.usecases.CreateMovieUseCase
import com.example.demo.usecases.ReadAllMoviesUseCase
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus

@RestController
@RequestMapping("/api/movies")
class MovieController(
    private val createMovieUseCase: CreateMovieUseCase,
    private val readAllMoviesUseCase: ReadAllMoviesUseCase
) {

    @PostMapping
    fun create(@RequestBody movie: Movie): ResponseEntity<Movie> {
        val createdMovie = createMovieUseCase.execute(movie)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMovie)
    }

    @GetMapping
    fun readAll(): ResponseEntity<List<Movie>> {
        val movies = readAllMoviesUseCase.execute()
        return ResponseEntity.status(HttpStatus.OK).body(movies)
    }
}
