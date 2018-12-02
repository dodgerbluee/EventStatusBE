package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.TeamsPlayers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamsPlayersRepository extends CrudRepository<TeamsPlayers, Long> {

    List<TeamsPlayers> getByTeamId(long id);
    List<TeamsPlayers> getByPlayerId(long id);
}