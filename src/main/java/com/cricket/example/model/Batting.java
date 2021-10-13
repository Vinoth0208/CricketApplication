package com.cricket.example.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Batting {
	//RUNS, MATCHES, AVG, BEST, SR
	@Id
	private int playerId;
	private int playerRuns;
	private int playerMatches;
	private double playerAverage;
	private int playerBest;
	private double playerStrikeRate;
	
	public Batting(int playerId, int playerRuns, int playerMatches, double playerAverage, int playerBest,
			double playerStrikeRate) {
		super();
		this.playerId = playerId;
		this.playerRuns = playerRuns;
		this.playerMatches = playerMatches;
		this.playerAverage = playerAverage;
		this.playerBest = playerBest;
		this.playerStrikeRate = playerStrikeRate;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerRuns() {
		return playerRuns;
	}

	public void setPlayerRuns(int playerRuns) {
		this.playerRuns = playerRuns;
	}

	public int getPlayerMatches() {
		return playerMatches;
	}

	public void setPlayerMatches(int playerMatches) {
		this.playerMatches = playerMatches;
	}

	public double getPlayerAverage() {
		return playerAverage;
	}

	public void setPlayerAverage(double playerAverage) {
		this.playerAverage = playerAverage;
	}

	public int getPlayerBest() {
		return playerBest;
	}

	public void setPlayerBest(int playerBest) {
		this.playerBest = playerBest;
	}

	public double getPlayerStrikeRate() {
		return playerStrikeRate;
	}

	public void setPlayerStrikeRate(double playerStrikeRate) {
		this.playerStrikeRate = playerStrikeRate;
	}

	@Override
	public String toString() {
		return "Batting [playerId=" + playerId + ", playerRuns=" + playerRuns + ", playerMatches=" + playerMatches
				+ ", playerAverage=" + playerAverage + ", playerBest=" + playerBest + ", playerStrikeRate="
				+ playerStrikeRate + "]";
	}
	
	
	

	
	
	
}
