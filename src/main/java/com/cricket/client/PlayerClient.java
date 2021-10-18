package com.cricket.client;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.model.Player;
import com.cricket.model.Team;

public interface PlayerClient {

	//Players
	@PostMapping("/addPlayers")
	public void addPlayer(@RequestBody Player player);
	@DeleteMapping("/deletePlayers/{id}")
	public void deletePlayer(@PathVariable("id") int id);

	@GetMapping ("/getPlayers")
	public List<Player> getPlayers();

	@GetMapping("/getPlayer/{id}")
	public Player getPlayerById(@PathVariable("id")int id);

	@PutMapping("/updatePlayer")   
	public void updatePlayerById(@RequestBody Player player);

}
