package com.cricket.example.model;

public class Batting {
	//RUNS, MATCHES, AVG, BEST, SR
	
	private int playerRuns;
	private int playerMatches;
	private double playerAverage;
	private int playerBest;
	private double playerStrikeRate;

	public Batting(int playerRuns, int playerMatches, double playerAverage, int playerBest, double playerStrikeRate) {
		super();
		this.playerRuns = playerRuns;
		this.playerMatches = playerMatches;
		this.playerAverage = playerAverage;
		this.playerBest = playerBest;
		this.playerStrikeRate = playerStrikeRate;
	}

	public int getPlayerRuns() {
		return playerRuns;
	}

	public int getPlayerMatches() {
		return playerMatches;
	}

	public double getPlayerAverage() {
		return playerAverage;
	}

	public int getPlayerBest() {
		return playerBest;
	}

	public double getPlayerStrikeRate() {
		return playerStrikeRate;
	}

	@Override
	public String toString() {
		return "Batting [playerRuns=" + playerRuns + ", playerMatches=" + playerMatches + ", playerAverage="
				+ playerAverage + ", playerBest=" + playerBest + ", playerStrikeRate=" + playerStrikeRate + "]";
	}
	
	
	
}
