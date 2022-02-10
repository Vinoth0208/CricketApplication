package com.cricket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.model.Team;
import com.cricket.repository.TeamRepo;
import com.cricket.service.TeamService;
@Service  
public class TeamImpl implements TeamService   {

	@Autowired
	TeamRepo teamRepo;
	
	@Override
	public int createTeam(Team team) {
		team = teamRepo.save(team);
		return team.getId();
	}

	@Override
	public void deleteTeam(int id) {
		teamRepo.deleteById(id);
		
	}

	@Override
	public List<Team> getTeams() {
		return new ArrayList<>(teamRepo.findAll());
	}

	@Override
	public Team getTeamById(int id) {
		return teamRepo.getById(id);
	}

	@Override
	public void updateTeamById(Team team) {
		Team teamFromDb = teamRepo.findById(team.getId()).get();
		teamFromDb.setCaptain(team.getCaptain());
		teamFromDb.setName(team.getName());
		teamRepo.save(team);
	}

}
