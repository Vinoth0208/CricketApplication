package com.cricket.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Match {

    public enum CurrentInnings {
        FIRST_INNINGS(1), SECOND_INNINGS(2), THIRD_INNINGS(3), FOURTH_INNINGS(4);
        CurrentInnings(int i) {
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "state", nullable = false)
    private Status matchProgress;
    @Column(name = "currentInnings", nullable = false)
    private CurrentInnings currentInnings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getMatchProgress() {
        return matchProgress;
    }

    public void setMatchProgress(Status state) {
        this.matchProgress = state;
    }

    public CurrentInnings getCurrentInnings() {return currentInnings;}

    public void setCurrentInnings(CurrentInnings currentInnings) {this.currentInnings = currentInnings;}
}
