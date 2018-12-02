package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.factory.PlayerFactory;
import com.dodgerbluee.eventstatusbe.model.Player;
import com.dodgerbluee.eventstatusbe.repository.PlayerRepository;
import com.dodgerbluee.eventstatusbe.request.PlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    private final PlayerFactory playerFactory = new PlayerFactory();

    public Player getPlayerById(long id) throws Exception {
        return playerRepository.findById(id).orElseThrow(() -> new Exception("Player not found by id: " + id));
    }

    public List<Player> getPlayerByName(String firstName, String lastName) {
        List<Player> playerList = new ArrayList<>();
        if(lastName != null) {
            playerList.addAll(playerRepository.findByLastName(lastName));
        }
        else if(firstName != null) {
            playerList.addAll(playerRepository.findByFirstName(firstName));
        }
        else {
            System.out.println("Invalid entry. No name entered.");
        }

        return playerList;
    }

    public void addPlayer(PlayerRequest playerRequest) {
        playerRepository.save(playerFactory.createPlayer(playerRequest));
    }

//    public void updateStatus(StatusUpdateRequest statusUpdateRequest) {
//        Player player = playerRepository.findById(statusUpdateRequest.getId()).get();
//
//        player.setStatus(statusUpdateRequest.getStatus());
//
//        playerRepository.save(player);
//    }

    public List<Player> getAll() {
        List<Player> playerList = new ArrayList<>();
        playerRepository.findAll().forEach(playerList::add);

        return playerList;
    }

    public void deleteById(long id) {
        playerRepository.deleteById(id);
    }
}