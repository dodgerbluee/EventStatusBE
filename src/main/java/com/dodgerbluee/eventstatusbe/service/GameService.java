package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.model.Game;
import com.dodgerbluee.eventstatusbe.repository.GameRepository;
import com.dodgerbluee.eventstatusbe.request.GameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameService gameService;

    @Autowired
    private GameRepository gameRepository;

    Game createGame(GameRequest gameRequest) {
        Game game = new Game(gameRequest.getDate(), gameRequest.getGameTime(), gameRequest.getSide(),
                gameRequest.getLocation());
        gameRepository.save(game);
        return game;
    }
}
