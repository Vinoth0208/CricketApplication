package com.cricket.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Player {
	//id, name, type, avg, batting, bowling,team
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerid;
	private String playerName;
	private String playerType;
	private double playerAverage;
	@OneToOne   
	private Batting battingStats;
	@OneToOne
	private Bowling bowlingStats;
	private String playerTeam;
	
	public Player(int playerid, String playerName, String playerType, double playerAverage, Batting battingStats,
			Bowling bowlingStats, String playerTeam) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.playerType = playerType;
		this.playerAverage = playerAverage;
		this.battingStats = battingStats;
		this.bowlingStats = bowlingStats;
		this.playerTeam = playerTeam;
	}

	
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}


	public void setPlayerAverage(double playerAverage) {
		this.playerAverage = playerAverage;
	}


	public void setBattingStats(Batting battingStats) {
		this.battingStats = battingStats;
	}


	public void setBowlingStats(Bowling bowlingStats) {
		this.bowlingStats = bowlingStats;
	}


	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}


	public int getPlayerid() {
		return playerid;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPlayerType() {
		return playerType;
	}

	public double getPlayerAverage() {
		return playerAverage;
	}

	public Batting getBattingStats() {
		return battingStats;
	}

	public Bowling getBowlingStats() {
		return bowlingStats;
	}

	public String getPlayerTeam() {
		return playerTeam;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playerName=" + playerName + ", playerType=" + playerType
				+ ", playerAverage=" + playerAverage + ", battingStats=" + battingStats + ", bowlingStats="
				+ bowlingStats + ", playerTeam=" + playerTeam + "]";
	}
	
	
	
}
