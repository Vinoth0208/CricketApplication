package com.cricket.example.Api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.example.model.Player;
import com.cricket.example.model.Team;

public interface Api {

	//Players
	@PostMapping("/addPlayers")
	public void addPlayer(@RequestBody Player player);
	@DeleteMapping("/deletePlayers/{playerId}")
	public void deletePlayer(@PathVariable("playerId") int playerId);

	@GetMapping ("/players")
	public List<Player> getPlayers();

	@GetMapping("/player/{playerId}")
	public Player getPlayerById(@PathVariable("playerId")int playerId);

	@PutMapping("/updatePlayer")   
	public void updatePlayerById(@RequestBody Player player);


	//Teams
	@PostMapping("/addTeam")
	public void addTeam(@RequestBody Team team);
	@DeleteMapping("/deleteTeam/{teamId}")
	public void deleteTeam(@PathVariable("teamId") int teamId);

	@GetMapping ("/teams")
	public List<Team> getTeams();

	@GetMapping("/team/{teamId}")
	public Team getTeamById(@PathVariable("teamId")int teamId);

	@PutMapping("/updateTeam")   
	public void updateTeamById(@RequestBody Team team);

}
