package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}