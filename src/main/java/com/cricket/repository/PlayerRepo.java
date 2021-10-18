package com.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cricket.model.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
