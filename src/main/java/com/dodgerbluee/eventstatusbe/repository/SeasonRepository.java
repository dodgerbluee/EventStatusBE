package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.Season;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends CrudRepository<Season, Long> {
}