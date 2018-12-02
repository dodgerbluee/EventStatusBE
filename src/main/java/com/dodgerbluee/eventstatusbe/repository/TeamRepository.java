package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
}
