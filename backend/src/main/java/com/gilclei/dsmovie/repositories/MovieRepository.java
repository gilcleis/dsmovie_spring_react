package com.gilclei.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilclei.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
