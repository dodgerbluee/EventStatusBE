package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.GamesStatuses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesStatusesRepository extends CrudRepository<GamesStatuses, Long> {
}