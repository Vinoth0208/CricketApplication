package com.cricket.model;

import javax.persistence.*;

@Entity
@Table(name = "batsmanInnings")
public class BatsmanInnings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BATSMAN_INNINGS_PK", nullable = false)
    private Long id;
    
    @Column(name = "BATSMAN_ID")
    private long batsmanId;
    
    @Column(name = "BATSMAN_NAME")
    private String name;
    
    @Column(name = "RUNS_SCORED")
    private int runsScored;

    @Column(name = "NO_OF_BALLS_PLAYED")
    private int noOfBallsPlayed;
    
    @Column(name = "BOUNDARIES")
    private int boundaries;
    
    @Column(name = "SIXES")
    private int sixes;
    
    @Column(name = "STRIKE_RATE")
    private double strikeRate;
    
    @Column(name = "STATE")
    private BattingState state;

    @Column(name = "team_id", nullable = false)
    private int teamId;

    @ManyToOne
    @JoinColumn(name = "INNINGS_ID", referencedColumnName = "INNINGS_ID")
    private Innings batsmanInnings;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Innings getBatsmanInnings() {
        return batsmanInnings;
    }

    public void setBatsmanInnings(Innings batsmanInnings) {
        this.batsmanInnings = batsmanInnings;
    }

    public BatsmanInnings() { }

    public BatsmanInnings(String name, int teamId) {
        this.name = name;
        this.teamId = teamId;
    }

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

    public BatsmanInnings(BatterInningsBuilder batterInnings) {
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

        public BatsmanInnings build() {
            return new BatsmanInnings(this);
        }
    }

}
