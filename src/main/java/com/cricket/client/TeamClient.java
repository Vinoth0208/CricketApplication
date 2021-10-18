package com.cricket.client;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.model.Team;

public interface TeamClient {
	//Teams
	@PostMapping("/addTeam")
	public void addTeam(@RequestBody Team team);
	@DeleteMapping("/deleteTeam/{id}")
	public void deleteTeam(@PathVariable("id") int id);

	@GetMapping ("/getTeams")
	public List<Team> getTeams();

	@GetMapping("/getTeam/{id}")
	public Team getTeamById(@PathVariable("id")int id);

	@PutMapping("/updateTeam")   
	public void updateTeamById(@RequestBody Team team);
}
