package com.cricket.model;

import javax.persistence.*;

@Entity
public class BatterInnings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private long batsmanId;
    private String name;
    private int runsScored;
    private int noOfBallsPlayed;
    private int boundaries;
    private int sixes;
    private double strikeRate;
    private BattingState state;

    public BatterInnings() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public long getBatsmanId() {
        return batsmanId;
    }

    public void setBatsmanId(long batsmanId) {
        this.batsmanId = batsmanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getNoOfBallsPlayed() {
        return noOfBallsPlayed;
    }

    public void setNoOfBallsPlayed(int noOfBallsPlayed) {
        this.noOfBallsPlayed = noOfBallsPlayed;
    }

    public int getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(int boundaries) {
        this.boundaries = boundaries;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public BattingState getState() {
        return state;
    }

    public void setState(BattingState state) {
        this.state = state;
    }

    public BatterInnings (BatterInningsBuilder batterInnings) {
        this.batsmanId = batterInnings.batsmanId;
        this.name = batterInnings.name;
        this.state = batterInnings.state;
    }

    public static class BatterInningsBuilder {
        private long batsmanId;
        private String name;
        private BattingState state;

        public BatterInningsBuilder batsmanId(long batsmanId) {
            this.batsmanId = batsmanId;
            return this;
        }

        public BatterInningsBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BatterInningsBuilder state(BattingState state) {
            this.state = state;
            return this;
        }

        public BatterInnings build() {
            return new BatterInnings(this);
        }
    }

}
