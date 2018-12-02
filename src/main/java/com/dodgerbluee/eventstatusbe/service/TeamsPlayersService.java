package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.model.Player;
import com.dodgerbluee.eventstatusbe.model.Team;
import com.dodgerbluee.eventstatusbe.model.TeamsPlayers;
import com.dodgerbluee.eventstatusbe.repository.PlayerRepository;
import com.dodgerbluee.eventstatusbe.repository.TeamRepository;
import com.dodgerbluee.eventstatusbe.repository.TeamsPlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamsPlayersService {

    @Autowired
    private TeamsPlayersRepository teamsPlayersRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    public List<Player> getTeamsPlayers(long id) throws Exception {
        List<Long> playerIdList = new ArrayList<>();
        List<Player> playerList = new ArrayList<>();

        for(TeamsPlayers current: teamsPlayersRepository.getByTeamId(id)) {

            playerIdList.add(current.getPlayerId());
        }

        for(Long playerId: playerIdList) {
            Player player = playerRepository.findById(playerId).orElseThrow(() -> new Exception("Player not found by id: " + id));
            playerList.add(player);
        }

        return playerList;
    }

    public List<TeamsPlayers> getAll() {
        List<TeamsPlayers> teamsPlayersList = new ArrayList<>();
        teamsPlayersRepository.findAll().forEach(teamsPlayersList::add);

        return teamsPlayersList;
    }

    public List<Team> getPlayersTeams(long id) throws Exception {
        List<Long> teamIdList = new ArrayList<>();
        List<Team> teamList = new ArrayList<>();

        for(TeamsPlayers current: teamsPlayersRepository.getByPlayerId(id)) {

            teamIdList.add(current.getPlayerId());
        }

        for(Long playerId: teamIdList) {
            Team team = teamRepository.findById(playerId).orElseThrow(() -> new Exception("Player not found by id: " + id));
            teamList.add(team);
        }

        return teamList;
    }
}