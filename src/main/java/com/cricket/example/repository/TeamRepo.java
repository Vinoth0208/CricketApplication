package com.cricket.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cricket.example.model.Team;

public interface TeamRepo extends JpaRepository <Team, Integer>  {

}
