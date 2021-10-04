package com.cricket.example.model;

public class Bowling {
	//W, M, AVG, BEST, ECO
	
	private int playerWickets;
	private int playerMatches;
	private double playerAverage;
	private int playerBest;
	private double playerEconomy;
	
	public Bowling(int playerWickets, int playerMatches, double playerAverage, int playerBest, double playerEconomy) {
		super();
		this.playerWickets = playerWickets;
		this.playerMatches = playerMatches;
		this.playerAverage = playerAverage;
		this.playerBest = playerBest;
		this.playerEconomy = playerEconomy;
	}

	public int getPlayerWickets() {
		return playerWickets;
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

	public double getPlayerEconomy() {
		return playerEconomy;
	}

	@Override
	public String toString() {
		return "Bowling [playerWickets=" + playerWickets + ", playerMatches=" + playerMatches + ", playerAverage="
				+ playerAverage + ", playerBest=" + playerBest + ", playerEconomy=" + playerEconomy + "]";
	}
	
	
}
