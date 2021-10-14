package com.cricket.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cricket.example.model.Team;

@Service 
public interface teamService {

	public void addTeam(Team team);
	
	public void deleteTeam(int teamId);
	
	public List<Team> getTeams();
	
	public Team getTeamById(int teamId);
	
	public void updateTeamById(Team team);
}
