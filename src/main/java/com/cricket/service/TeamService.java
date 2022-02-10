package com.cricket.service;

import java.util.List;

import com.cricket.model.Team;


public interface TeamService {

	public int createTeam(Team team);
	
	public void deleteTeam(int id);
	
	public List<Team> getTeams();
	
	public Team getTeamById(int id);
	
	public void updateTeamById(Team team);
}
