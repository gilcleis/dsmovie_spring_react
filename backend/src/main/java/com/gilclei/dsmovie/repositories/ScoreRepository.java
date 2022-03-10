package com.gilclei.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilclei.dsmovie.entities.Score;
import com.gilclei.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
