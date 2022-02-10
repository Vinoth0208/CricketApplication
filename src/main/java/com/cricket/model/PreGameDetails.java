package com.cricket.model;

public class PreGameDetails {
    String battingTeamName;
    String bowlingTeamName;
    int totalOvers = 0;
    int playerPerTeam = 0;
    String striker;
    int strikerId;
    String nonStriker;
    int nonStrikerId;
    String bowler;

    public PreGameDetails() {super();}

    public PreGameDetails(PreGameDetails preGameDetails) {
        super();
        this.totalOvers = preGameDetails.totalOvers;
        this.playerPerTeam = preGameDetails.playerPerTeam;
        this.striker = preGameDetails.striker;
        this.strikerId = preGameDetails.strikerId;
        this.nonStriker = preGameDetails.nonStriker;
        this.nonStrikerId = preGameDetails.nonStrikerId;
        this.bowler = preGameDetails.bowler;
        this.battingTeamName = preGameDetails.battingTeamName;
        this.bowlingTeamName = preGameDetails.bowlingTeamName;
    }

    public PreGameDetails(String battingTeamName, String bowlingTeamName, int totalOvers, int playerPerTeam, String striker, int strikerId, String nonStriker, int nonStrikerId, String bowler) {
        super();
        this.battingTeamName = battingTeamName;
        this.bowlingTeamName = bowlingTeamName;
        this.totalOvers = totalOvers;
        this.playerPerTeam = playerPerTeam;
        this.striker = striker;
        this.strikerId = strikerId;
        this.nonStriker = nonStriker;
        this.nonStrikerId = nonStrikerId;
        this.bowler = bowler;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public void setBattingTeamName(String battingTeamName) {
        this.battingTeamName = battingTeamName;
    }

    public String getBowlingTeamName() {
        return bowlingTeamName;
    }

    public void setBowlingTeamName(String bowlingTeamName) {
        this.bowlingTeamName = bowlingTeamName;
    }

    public int getTotalOvers() {
        return totalOvers;
    }

    public void setTotalOvers(int totalOvers) {
        this.totalOvers = totalOvers;
    }

    public int getPlayerPerTeam() {
        return playerPerTeam;
    }

    public void setPlayerPerTeam(int playerPerTeam) {
        this.playerPerTeam = playerPerTeam;
    }

    public String getStriker() {
        return striker;
    }

    public void setStriker(String striker) {
        this.striker = striker;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public int getStrikerId() {
        return strikerId;
    }

    public void setStrikerId(int strikerId) {
        this.strikerId = strikerId;
    }

    public int getNonStrikerId() {
        return nonStrikerId;
    }

    public void setNonStrikerId(int nonStrikerId) {
        this.nonStrikerId = nonStrikerId;
    }
}
