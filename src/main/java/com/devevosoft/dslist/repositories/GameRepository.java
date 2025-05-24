package com.devevosoft.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devevosoft.dslist.entities.Game;



public interface GameRepository extends JpaRepository<Game, Long> 
{
	
}
