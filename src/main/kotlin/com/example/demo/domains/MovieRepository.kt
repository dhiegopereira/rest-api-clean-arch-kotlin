package com.example.demo.domains;

public interface MovieRepository {
    fun save(movie: Movie): Movie
    fun findAll(): List<Movie>
}