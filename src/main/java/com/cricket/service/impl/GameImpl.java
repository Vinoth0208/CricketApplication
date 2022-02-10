package com.cricket.service.impl;

import com.cricket.model.*;
import com.cricket.repository.GameRepo;
import com.cricket.service.GameService;
import com.cricket.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameImpl implements GameService {

    @Autowired
    GameRepo gameRepo;

    @Autowired
    TeamService teamService;

    @Override
    public Game createGame(PreGameDetails preGameDetails) {
        List<Innings> inningsList = new ArrayList<>();
        int battingTeamId = teamService.createTeam(new Team(preGameDetails.getBattingTeamName()));
        int bowlingTeamId = teamService.createTeam(new Team(preGameDetails.getBowlingTeamName()));
        inningsList.add(createFirstInningsAndStartGame(preGameDetails, battingTeamId, bowlingTeamId));
        Game game = new Game();
        game.setGameProgress(Status.IN_PROGRESS);
        game.setCurrentInnings(CurrentInnings.FIRST_INNINGS);
        game.setInnings(inningsList);
        game.setOversPerInnings(preGameDetails.getTotalOvers());
        game.setPlayersPerTeam(preGameDetails.getPlayerPerTeam());
        gameRepo.save(game);
        return game;
    }

    private Innings createFirstInningsAndStartGame(PreGameDetails preGameDetails, int battingTeamId, int bowlingTeamId) {
        Innings innings = new Innings();
        innings.setCurrentInnings(CurrentInnings.FIRST_INNINGS);
        innings.setInningsStatus(Status.IN_PROGRESS);
        List<BatsmanInnings> batsmanInnings = new ArrayList<>();
        batsmanInnings.add(new BatsmanInnings(preGameDetails.getStriker(), battingTeamId));
        batsmanInnings.add(new BatsmanInnings(preGameDetails.getNonStriker(), battingTeamId));
        innings.setBatsmanInnings(batsmanInnings);
        List<BowlerInnings> bowlerInnings = new ArrayList<>();
        bowlerInnings.add(new BowlerInnings(preGameDetails.getBowler(), bowlingTeamId, 0));
        innings.setBowlerInnings(bowlerInnings);
        return innings;
    }
}
