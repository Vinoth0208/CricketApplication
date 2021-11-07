package com.cricket.model;

import javax.persistence.*;

@Entity
public class BowlerInnings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bowlerId", nullable = false)
    private long bowlerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "oversBowled")
    private int oversBowled = 0;

    @Column(name = "runsConceded")
    private int runsConceded = 0;

    @Column(name = "wickets")
    private int wickets = 0;

    @Column(name = "maidens")
    private int maidens = 0;

    @Column(name = "economy")
    private double economy = 0.0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
