package com.cricket.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated
    @Column(name = "game_progress", nullable = false)
    private Status gameProgress;

    @Enumerated
    @Column(name = "current_innings", nullable = false)
    private CurrentInnings currentInnings;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private List<Innings> innings = new ArrayList<>();

    @Column(name = "overs_per_innings", nullable = false)
    private int oversPerInnings;

    @Column(name = "players_per_team", nullable = false)
    private int playersPerTeam;

    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    public int getOversPerInnings() {
        return oversPerInnings;
    }

    public void setOversPerInnings(int oversPerInnings) {
        this.oversPerInnings = oversPerInnings;
    }

    public List<Innings> getInnings() {
        return innings;
    }

    public void setInnings(List<Innings> innings) {
        this.innings = innings;
    }

    public CurrentInnings getCurrentInnings() {
        return currentInnings;
    }

    public void setCurrentInnings(CurrentInnings currentInnings) {
        this.currentInnings = currentInnings;
    }

    public Status getGameProgress() {
        return gameProgress;
    }

    public void setGameProgress(Status gameProgress) {
        this.gameProgress = gameProgress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}