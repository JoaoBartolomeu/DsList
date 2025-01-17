package com.joaodev.dsList.repositories;

import com.joaodev.dsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
