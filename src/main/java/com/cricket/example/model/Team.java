package com.cricket.example.model;

public class Team {
	//id,name, captain
	
	private int id;
	private String teamName;
	private String teamCaptain;
	
	public Team(int id, String teamName, String teamCaptain) {
		super();
		this.id = id;
		this.teamName = teamName;
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
