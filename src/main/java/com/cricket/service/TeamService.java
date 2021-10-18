package com.cricket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cricket.model.Team;


public interface TeamService {

	public void addTeam(Team team);
	
	public void deleteTeam(int id);
	
	public List<Team> getTeams();
	
	public Team getTeamById(int id);
	
	public void updateTeamById(Team team);
}
