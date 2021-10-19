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

import com.cricket.model.Player;


@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path = "player")
public interface PlayerClient {

	//Players
	@PostMapping("/add")
	public void addPlayer(@RequestBody Player player);
	
	@DeleteMapping("/delete/{id}")
	public void deletePlayer(@PathVariable("id") int id);

	@GetMapping ("/getAll")
	public List<Player> getPlayers();

	@GetMapping("/get/{id}")
	public Player getPlayerById(@PathVariable("id")int id);

	@PostMapping("/update")   
	public void updatePlayer(@RequestBody Player player);

}
