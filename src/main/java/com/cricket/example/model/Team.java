package com.cricket.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Team {
	//id,name, captain
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamName;
	private String teamCaptain;
	
	public Team(int id, String teamName, String teamCaptain) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.teamCaptain = teamCaptain;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}


	public int getId() {
		return id;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getTeamCaptain() {
		return teamCaptain;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", teamCaptain=" + teamCaptain + "]";
	}
	
	
	
}
