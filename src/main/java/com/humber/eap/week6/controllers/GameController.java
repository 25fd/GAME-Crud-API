package com.humber.eap.week6.controllers;

import com.humber.eap.week6.models.Game;
import com.humber.eap.week6.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private GameRepository gameRepository;
    @Autowired
    public GameController(
            GameRepository gameRepository
    ) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/")
    public List<Game> getAllGames() {
        return (List<Game>) gameRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity addGame (@RequestBody @Validated Game game) {
         this.gameRepository.save(game);
        return ResponseEntity.ok().build();
    }
}
