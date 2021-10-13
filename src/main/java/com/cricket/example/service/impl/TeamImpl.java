package com.cricket.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.example.model.Player;
import com.cricket.example.model.Team;
import com.cricket.example.repository.TeamRepo;
import com.cricket.example.service.teamService;

public class TeamImpl implements teamService   {

	@Autowired
	TeamRepo teamRepo;
	
	@Override
	public void addTeam(Team team) {
		teamRepo.save(team);	
	}

	@Override
	public void deleteTeam(int teamId) {
		teamRepo.deleteById(teamId);
		
	}

	@Override
	public List<Team> getTeams() {
		List<Team> team=new ArrayList<>();
		teamRepo.findAll().forEach(teams->team.add(teams) );
		return team;
	}

	@Override
	public Team getTeamById(int teamId) {
		
		return teamRepo.getById(teamId);
	}

	@Override
	public void updateTeamById(Team team) {
		teamRepo.save(team);
		
	}

}
