package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.model.Player;
import com.dodgerbluee.eventstatusbe.request.PlayerRequest;
import com.dodgerbluee.eventstatusbe.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
class PlayerController {

    @Autowired
    private final PlayerService playerService = new PlayerService();

    @GetMapping("/getall")
    public List<Player> getAllPlayers() {
        return playerService.getAll();
    }

    @GetMapping("/get/id/{id}")
    public Player getPlayerById(@PathVariable long id) throws Exception {
        return playerService.getPlayerById(id);
    }

    @GetMapping("/get/name")
    public List<Player> getPlayerByName(@RequestParam(name = "FirstName", required = false) String firstName,
                                        @RequestParam(name ="LastName", required = false) String lastName) {
        return playerService.getPlayerByName(firstName, lastName);
    }

    @PostMapping("/add")
    public void addPlayer(@RequestBody PlayerRequest playerRequest) {
        playerService.addPlayer(playerRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable long id) {
        playerService.deleteById(id);
    }

//    @PutMapping("/update")
//    public void updatePlayerStatus(@RequestBody StatusUpdateRequest statusUpdateRequest) {
//        playerService.updateStatus(statusUpdateRequest);
//    }
}