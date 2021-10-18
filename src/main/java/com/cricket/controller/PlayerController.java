package com.cricket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricket.client.PlayerClient;
import com.cricket.model.Player;
import com.cricket.service.impl.PlayerImpl;
import com.cricket.service.impl.TeamImpl;


@RestController
public class PlayerController implements PlayerClient  {
	
	@Autowired 
	PlayerImpl playerImpl;
	
	
	//Players
	public void addPlayer(Player player) {
		playerImpl.addPlayer(player);
	}
	
	public void deletePlayer(int id) {
			playerImpl.deletePlayer(id);			
	}

	
	public List<Player> getPlayers() {
		return playerImpl.getPlayers();
	}

	
	public Player getPlayerById(int id) {
		return playerImpl.getPlayerById(id);
	}

	   
	public void updatePlayerById(Player player) {
		playerImpl.updatePlayerById(player); 
		
	}
}
