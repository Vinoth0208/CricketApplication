package com.cricket.service;

import java.util.List;

import com.cricket.model.Player;

public interface PlayersService {
	
	public void addPlayer(Player player);
	
	public void deletePlayer(int id);
	
	public List<Player> getPlayers();
	
	public Player getPlayerById(int id);
	
	public void updatePlayerById(Player player);
	

}
