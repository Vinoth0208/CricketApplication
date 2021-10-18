package com.cricket.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bowling {
	//W, M, AVG, BEST, ECO

	@Id 
	private int id;
	private int wickets;
	private int matches;
	private double average;
	private int best;
	private double economy;
	
	public Bowling() {
		super();
		
	}

	public Bowling(int id, int wickets, int matches, double average, int best, double economy) {
		super();
		this.id = id;
		this.wickets = wickets;
		this.matches = matches;
		this.average = average;
		this.best = best;
		this.economy = economy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getBest() {
		return best;
	}

	public void setBest(int best) {
		this.best = best;
	}

	public double getEconomy() {
		return economy;
	}

	public void setEconomy(double economy) {
		this.economy = economy;
	}

	@Override
	public String toString() {
		return "Bowling [id=" + id + ", wickets=" + wickets + ", matches=" + matches + ", average=" + average
				+ ", best=" + best + ", economy=" + economy + "]";
	}
	
		
}
