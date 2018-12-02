package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.model.Game;
import com.dodgerbluee.eventstatusbe.model.Season;
import com.dodgerbluee.eventstatusbe.repository.SeasonRepository;
import com.dodgerbluee.eventstatusbe.request.GameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {
    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private GameService gameService;

    public void addGameToSeason(long seasonId, GameRequest gameRequest) throws Exception {
        List<Game> gameList;
        Game game = gameService.createGame(gameRequest);
        Season season = seasonRepository.findById(seasonId).orElseThrow(() -> new Exception("Season not found by id: " + seasonId));
        gameList = season.getGames();
        gameList.add(game);
        seasonRepository.save(season);
    }
}
