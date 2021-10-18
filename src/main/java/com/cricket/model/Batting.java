package com.cricket.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Batting {
	//RUNS, MATCHES, AVG, BEST, SR
	@Id
	private int id;
	private int runs;
	private int matches;
	private double average;
	private int best;
	private double strikeRate;
	
	public Batting() {
		super();
		}

	public Batting(int id, int runs, int matches, double average, int best, double strikeRate) {
		super();
		this.id = id;
		this.runs = runs;
		this.matches = matches;
		this.average = average;
		this.best = best;
		this.strikeRate = strikeRate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
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
	
	public double getStrikeRate() {
		return strikeRate;
	}
	
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	
	@Override
	public String toString() {
		return "Batting [id=" + id + ", runs=" + runs + ", matches=" + matches + ", average=" + average + ", best="
				+ best + ", strikeRate=" + strikeRate + "]";
	}
	
	
}
