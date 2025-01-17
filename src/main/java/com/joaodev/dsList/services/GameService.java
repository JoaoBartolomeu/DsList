package com.joaodev.dsList.services;

import com.joaodev.dsList.dto.GameMinDTO;
import com.joaodev.dsList.entities.Game;
import com.joaodev.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
        return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
