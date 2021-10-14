package com.cricket.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.example.Api.Api;
import com.cricket.example.model.*;
import com.cricket.example.service.impl.PlayerImpl;
import com.cricket.example.service.impl.TeamImpl;


@RestController
public class CommonController implements Api  {
	
	@Autowired 
	PlayerImpl playerImpl;
	TeamImpl teamImpl;
	
	//Players
	public void addPlayer(Player player) {
		playerImpl.addPlayer(player);
	}
	
	public void deletePlayer(int playerId) {
		playerImpl.deletePlayer(playerId);
	}

	
	public List<Player> getPlayers() {
		return playerImpl.getPlayers();
	}

	
	public Player getPlayerById(int playerId) {
		return playerImpl.getPlayerById(playerId);
	}

	   
	public void updatePlayerById(Player player) {
		playerImpl.updatePlayerById(player); 
		
	}

	//Teams
	public void addTeam(Team team) {
		teamImpl.addTeam(team);
	}
	
	public void deleteTeam(int teamId) {
		teamImpl.deleteTeam(teamId);
	}

	
	public List<Team> getTeams() {
		return teamImpl.getTeams();
	}

	
	public Team getTeamById(int teamId) {
		return teamImpl.getTeamById(teamId);
	}

	   
	public void updateTeamById(Team team) {
		teamImpl.updateTeamById(team); 
		
	}


}
