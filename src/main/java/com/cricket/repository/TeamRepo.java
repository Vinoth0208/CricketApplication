package com.cricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cricket.model.Team;

public interface TeamRepo extends JpaRepository <Team, Integer>  {

}
