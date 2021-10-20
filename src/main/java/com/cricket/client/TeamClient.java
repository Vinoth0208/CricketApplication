package com.cricket.client;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.model.Team;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path = "team")
public interface TeamClient {
	//Teams
	@PostMapping("/add")
	public void addTeam(@RequestBody Team team);
	
	@DeleteMapping("/delete/{id}")
	public void deleteTeam(@PathVariable("id") int id);

	@GetMapping ("/getAll")
	public List<Team> getTeams();

	@GetMapping("/get/{id}")
	public Team getTeamById(@PathVariable("id")int id);

	@PostMapping("/update")   
	public void updateTeam(@RequestBody Team team);
}
