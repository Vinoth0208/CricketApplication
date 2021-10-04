package com.cricket.example.model;

public class Player {
	//id, name, type, avg, batting, bowling,team
	private int playerid;
	private String playerName;
	private String playerType;
	private double playerAverage;
	private Batting battingStats;
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
