package com.cricket.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.example.model.Player;
import com.cricket.example.repository.PlayerRepo;
import com.cricket.example.service.playersService;

@Service
public class PlayerImpl implements playersService {
	
	@Autowired
	PlayerRepo playerRepo;

	@Override
	public void addPlayer(Player player) {
		playerRepo.save(player);
	}

	@Override
	public void deletePlayer(int playerId) {
		playerRepo.deleteById( playerId);
		
	}

	@Override
	public List<Player> getPlayers() {
		List<Player> player=new ArrayList<>();
		playerRepo.findAll().forEach(players->player.add(players) );
		return player ;
	}

	@Override
	public Player getPlayerById(int playerId) {
		return playerRepo.getById(playerId) ;
	}

	@Override
	public void updatePlayerById(Player player) {
		playerRepo.save(player); 
		
	}

}
