package com.cricket.example.service;

import java.util.List;

import com.cricket.example.model.Player;

public interface playersService {
	
	public void addPlayer(Player player);
	
	public void deletePlayer(int playerId);
	
	public List<Player> getPlayers();
	
	public Player getPlayerById(int playerId);
	
	public void updatePlayerById(Player player);
	

}
