package com.dodgerbluee.eventstatusbe.config;

import com.dodgerbluee.eventstatusbe.model.*;
import com.dodgerbluee.eventstatusbe.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class SetInitialData implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private SeasonRepository seasonRepository;

    @Autowired
    private TeamsPlayersRepository teamsPlayersRepository;

    @Autowired
    private GamesStatusesRepository gamesStatusesRepository;

    @Override
    public void run(String... args) {
//        Player greg = new Player("Greg", "Sanders", "5419799955", "35",
//                "gregasanders91@gmail.com");
//        Player tom = new Player("Tom", "Clausing", "9999999999", "12",
//                "tom@gmail.com");
//        Player zac = new Player("Zac", "Sanders", "2145412732", "5",
//                "zacmari5@gmail.com");
//
//        List<Game> gameListSpM = new ArrayList<>();
//
//        Game gameOneSpM = new Game("2/19/2019", GameTime.SEVEN, Side.HOME, "Field9");
//        Game gameTwoSpM = new Game("2/26/2019", GameTime.NINE, Side.AWAY, "Field7");
//
//        gameListSpM.add(gameOneSpM);
//        gameListSpM.add(gameTwoSpM);
//
//        List<Game> gameListSuM = new ArrayList<>();
//
//        Game gameOneSuM = new Game("2/19/2019", GameTime.SEVEN, Side.HOME, "Field9");
//        Game gameTwoSuM = new Game("2/26/2019", GameTime.NINE, Side.AWAY, "Field7");
//
//        gameListSuM.add(gameOneSuM);
//        gameListSuM.add(gameTwoSuM);
//
//        List<Game> gameListSuC = new ArrayList<>();
//
//        Game gameOneSuC = new Game("2/19/2019", GameTime.SEVEN, Side.HOME, "Field9");
//        Game gameTwoSuC = new Game("2/26/2019", GameTime.NINE, Side.AWAY, "Field7");
//
//        gameListSuC.add(gameOneSuC);
//        gameListSuC.add(gameTwoSuC);
//
//        List<Game> gameListSpC = new ArrayList<>();
//
//        Game gameOneSpC = new Game("2/19/2019", GameTime.SEVEN, Side.HOME, "Field9");
//        Game gameTwoSpC = new Game("2/26/2019", GameTime.NINE, Side.AWAY, "Field7");
//
//        gameListSpC.add(gameOneSpC);
//        gameListSpC.add(gameTwoSpC);
//
//        Season spring19Men = new Season(SeasonType.SPRING, "2019", gameListSpM);
//        Season summer19Men = new Season(SeasonType.SUMMER, "2019", gameListSuM);
//        Season summer19Coed = new Season(SeasonType.SUMMER, "2019", gameListSpC);
//        Season spring19Coed = new Season(SeasonType.SPRING, "2019", gameListSuC);
//
//        Team mensSpring19 = new Team("Change Ups", TeamType.MENS, spring19Men);
//        Team coedSpring19 = new Team("Change Ups", TeamType.COED, spring19Coed);
//
//        Team mensSummer19 = new Team("Change Ups", TeamType.MENS, summer19Men);
//        Team coedSummer19 = new Team("Change Ups", TeamType.COED, summer19Coed);
//
//        playerRepository.save(greg);
//        playerRepository.save(tom);
//        playerRepository.save(zac);
//
//        gameRepository.save(gameOneSuM);
//        gameRepository.save(gameOneSuC);
//        gameRepository.save(gameOneSpM);
//        gameRepository.save(gameOneSpC);
//
//        gameRepository.save(gameTwoSuM);
//        gameRepository.save(gameTwoSuC);
//        gameRepository.save(gameTwoSpM);
//        gameRepository.save(gameTwoSpC);
//
//        seasonRepository.save(spring19Coed);
//        seasonRepository.save(spring19Men);
//        seasonRepository.save(summer19Men);
//        seasonRepository.save(summer19Coed);
//
//        teamRepository.save(coedSpring19);
//        teamRepository.save(mensSummer19);
//        teamRepository.save(coedSummer19);
//        teamRepository.save(mensSpring19);
//
//        teamsPlayersRepository.save(new TeamsPlayers(greg.getId(), mensSpring19.getId()));
//        teamsPlayersRepository.save(new TeamsPlayers(tom.getId(), mensSpring19.getId()));
//        teamsPlayersRepository.save(new TeamsPlayers(greg.getId(), mensSummer19.getId()));
//        teamsPlayersRepository.save(new TeamsPlayers(tom.getId(), mensSummer19.getId()));
//        teamsPlayersRepository.save(new TeamsPlayers(zac.getId(), coedSpring19.getId()));
//        teamsPlayersRepository.save(new TeamsPlayers(zac.getId(), coedSummer19.getId()));
//
//        gamesStatusesRepository.save(new GamesStatuses(gameOneSpM.getId(), greg.getId()));
//        gamesStatusesRepository.save(new GamesStatuses(gameTwoSpM.getId(), greg.getId()));
//
//        gamesStatusesRepository.save(new GamesStatuses(gameOneSpM.getId(), zac.getId()));
//        gamesStatusesRepository.save(new GamesStatuses(gameTwoSpM.getId(), zac.getId()));
//
//        gamesStatusesRepository.save(new GamesStatuses(gameOneSpM.getId(), tom.getId()));
//        gamesStatusesRepository.save(new GamesStatuses(gameTwoSpM.getId(), tom.getId()));
    }
}