package org.ashish.cricket_score_app.controller;

import org.ashish.cricket_score_app.entity.Player;
import org.ashish.cricket_score_app.service.impl.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping
    public ResponseEntity<?> addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return ResponseEntity.ok().body(player);
    }

    @GetMapping
    public ResponseEntity<?> getAllPlayers() {
        return ResponseEntity.ok().body(playerService.getAllPlayers());
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<?> getPlayer(@PathVariable int playerId) {
        return ResponseEntity.ok().body(playerService.getPlayer(playerId));
    }

    @PutMapping("/{playerId}")
    public ResponseEntity<?> updatePlayer(@RequestBody Player player, @PathVariable int playerId) {
        return ResponseEntity.ok().body(playerService.updatePlayer(player));
    }
}
