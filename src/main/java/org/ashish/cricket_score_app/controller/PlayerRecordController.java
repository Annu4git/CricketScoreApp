package org.ashish.cricket_score_app.controller;

import org.ashish.cricket_score_app.entity.PlayerRecord;
import org.ashish.cricket_score_app.service.impl.PlayerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerRecordController {

    @Autowired
    PlayerRecordService playerRecordService;

    @PutMapping("/{playerId}/records/add")
    public ResponseEntity<?> addPlayerRecords(@PathVariable int playerId, @RequestBody PlayerRecord playerRecord) {
        return ResponseEntity.ok().body(playerRecordService.updatePlayerRecords(playerId, playerRecord));
    }

    @GetMapping("/{playerId}/records")
    public ResponseEntity<PlayerRecord> getPlayerRecords(@PathVariable int playerId) {
        return ResponseEntity.ok().body(playerRecordService.getPlayerRecords(playerId));
    }

}
