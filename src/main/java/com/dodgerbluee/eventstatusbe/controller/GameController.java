package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
class GameController {
    @Autowired
    GameService gameService;

//    @PostMapping("/add")
//    void createGame(GameRequest gameRequest) {
//        gameService.createGame(gameRequest);
//    }
}
