package com.cricket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.model.Player;
import com.cricket.repository.PlayerRepo;
import com.cricket.service.PlayersService;

@Service
public class PlayerImpl implements PlayersService {
	
	@Autowired
	PlayerRepo playerRepo;

	@Override
	public void addPlayer(Player player) {
		playerRepo.save(player);
	}

	@Override
	public void deletePlayer(int id) {
		playerRepo.deleteById(id);
		
	}

	@Override
	public List<Player> getPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayerById(int playerId) {
		return playerRepo.getById(playerId) ;
	}

	@Override
	public void updatePlayerById(Player player) {
		Player playerFromDb=playerRepo.findById(player.getId()).get();
		playerFromDb.setId(player.getId());
		playerFromDb.setAverage(player.getAverage());
		playerFromDb.setBattingStats(player.getBattingStats());
		playerFromDb.setBowlingStats(player.getBowlingStats());
		playerFromDb.setName(player.getName());
		playerFromDb.setTeamId(player.getTeamId());
		playerFromDb.setType(player.getType());
		playerRepo.save(playerFromDb);
	}

}
