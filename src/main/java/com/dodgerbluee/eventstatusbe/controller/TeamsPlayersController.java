package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.model.Player;
import com.dodgerbluee.eventstatusbe.model.Team;
import com.dodgerbluee.eventstatusbe.model.TeamsPlayers;
import com.dodgerbluee.eventstatusbe.service.TeamsPlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
class TeamsPlayersController {

    private TeamsPlayers teamsPlayers;

    @Autowired
    private TeamsPlayersService teamsPlayersService;

    @GetMapping("/team/{id}/players")
    public List<Player> getTeamsPlayers(@PathVariable long id) throws Exception {
        return teamsPlayersService.getTeamsPlayers(id);
    }

    @GetMapping("/player/{id}/teams")
    public List<Team> getPlayersTeams(@PathVariable long id) throws Exception{
        return teamsPlayersService.getPlayersTeams(id);
    }

    @GetMapping("teamsplayers/getall")
    public List<TeamsPlayers> getAll() {
        return teamsPlayersService.getAll();
    }
}