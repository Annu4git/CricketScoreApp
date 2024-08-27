package org.ashish.cricket_score_app.service;

import org.ashish.cricket_score_app.entity.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Player Service
 */
@Service
public class PlayerService {

    List<Player> playerList = new ArrayList<>();

    /**
     * Add a new player
     * @param player Player to be added
     */
    public void addPlayer(Player player) {
        playerList.add(player);
    }

    /**
     * Get all players
     * @return List of all players
     */
    public List<Player> getAllPlayers() {
        return playerList;
    }

    /**
     * Update a player
     * @param player
     * @return Updated player
     */
    public Player updatePlayer(Player player) {
//        this.playerList.forEach(p -> p.);
        return null;
    }

}
