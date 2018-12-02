package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.model.Team;
import com.dodgerbluee.eventstatusbe.service.PlayerService;
import com.dodgerbluee.eventstatusbe.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
class TeamController {

    @Autowired
    PlayerService playerService = new PlayerService();

    @Autowired
    private final TeamService teamService = new TeamService();

    @GetMapping("/get/{id}")
    public Team getTeam(@PathVariable long id) throws Exception {
        return teamService.findById(id);
    }

    @GetMapping("/getall")
    public List<Team> getAllTeams() {
        return teamService.findAll();
    }

}