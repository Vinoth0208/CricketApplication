package com.cricket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.client.TeamClient;
import com.cricket.model.Team;
import com.cricket.service.impl.TeamImpl;

@RestController
public class TeamController implements TeamClient {

	@Autowired
	TeamImpl teamImpl;
	//Teams
		public void addTeam(Team team) {
			teamImpl.createTeam(team);
		}
		
		public void deleteTeam(int id) {
			teamImpl.deleteTeam(id);
		}

		public List<Team> getTeams() {
			return teamImpl.getTeams();
		}
		
		public Team getTeamById(int id) {
			return teamImpl.getTeamById(id);
		}

		public void updateTeam(Team team) {
			teamImpl.updateTeamById(team); 
			
		}
}
