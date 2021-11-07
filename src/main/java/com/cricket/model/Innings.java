package com.cricket.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "innings")
public class Innings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "matchId", nullable = false)
    private Long matchId;
    @Column(name = "inningsStatus", nullable = false)
    private Status inningsStatus;
    @Column(name = "batsmanInnings")
    @OneToMany
    private List<BatterInnings> batsmanInnings;
    @Column(name = "bowlerInnings")
    @OneToMany
    private List<BowlerInnings> bowlerInnings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
