package com.example.demo.usecases;

import org.springframework.stereotype.Service;

import com.example.demo.domains.Movie;
import com.example.demo.domains.MovieRepository;

@Service
data class ReadAllMoviesUseCase(val movieRepository: MovieRepository) {
    fun execute(): List<Movie> {
        return movieRepository.findAll()
    }
}