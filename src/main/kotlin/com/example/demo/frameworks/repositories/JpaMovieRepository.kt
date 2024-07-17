package com.example.demo.frameworks.repositories;

import com.example.demo.domains.Movie;
import com.example.demo.domains.MovieRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMovieRepository : JpaRepository<Movie, Long>, MovieRepository