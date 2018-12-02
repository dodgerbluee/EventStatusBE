package com.dodgerbluee.eventstatusbe.repository;

import com.dodgerbluee.eventstatusbe.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByLastName(String lastName);
    List<Player> findByFirstName(String firstName);
    void deleteById(long id);

//    @Modifying
//    @Query
//    void status(@Param("Status") Status status);
}
