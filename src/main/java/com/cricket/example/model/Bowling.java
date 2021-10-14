package com.cricket.example.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bowling {
	//W, M, AVG, BEST, ECO

	@Id 
	private int playerId;
	private int playerWickets;
	private int playerMatches;
	private double playerAverage;
	private int playerBest;
	private double playerEconomy;
	
	public Bowling(int playerId, int playerWickets, int playerMatches, double playerAverage, int playerBest,
			double playerEconomy) {
		super();
		this.playerId = playerId;
		this.playerWickets = playerWickets;
		this.playerMatches = playerMatches;
		this.playerAverage = playerAverage;
		this.playerBest = playerBest;
		this.playerEconomy = playerEconomy;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerWickets() {
		return playerWickets;
	}

	public void setPlayerWickets(int playerWickets) {
		this.playerWickets = playerWickets;
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

	public double getPlayerEconomy() {
		return playerEconomy;
	}

	public void setPlayerEconomy(double playerEconomy) {
		this.playerEconomy = playerEconomy;
	}

	@Override
	public String toString() {
		return "Bowling [playerId=" + playerId + ", playerWickets=" + playerWickets + ", playerMatches=" + playerMatches
				+ ", playerAverage=" + playerAverage + ", playerBest=" + playerBest + ", playerEconomy=" + playerEconomy
				+ "]";
	}
	

	
}
