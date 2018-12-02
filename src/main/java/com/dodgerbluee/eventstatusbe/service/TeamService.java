package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.model.Team;
import com.dodgerbluee.eventstatusbe.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    GameService gameService;

    public Team findById(long id) throws Exception {
        return teamRepository.findById(id).orElseThrow(() -> new Exception("Team not found by id: " + id));
    }

    public List<Team> findAll() {
        List<Team> teamList = new ArrayList<>();
        teamRepository.findAll().forEach(teamList::add);
        return teamList;
    }
}