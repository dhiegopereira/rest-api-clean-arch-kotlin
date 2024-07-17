package com.example.demo.usecases;

import org.springframework.stereotype.Service;

import com.example.demo.domains.Movie;
import com.example.demo.domains.MovieRepository;

@Service
data class CreateMovieUseCase(val movieRepository: MovieRepository) {
    fun execute(movie: Movie): Movie {
        return movieRepository.save(movie)
    }
}