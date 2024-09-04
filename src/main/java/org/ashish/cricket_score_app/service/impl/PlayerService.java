package org.ashish.cricket_score_app.service.impl;

import org.ashish.cricket_score_app.entity.Player;
import org.ashish.cricket_score_app.repository.PlayerRepository;
import org.ashish.cricket_score_app.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Player Service
 */
@Service
public class PlayerService implements IPlayerService {
    @Autowired
    PlayerRepository playerRepository;

    /**
     * Add a new player
     * @param player Player to be added
     */
    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    /**
     * Get all players
     * @return List of all players
     */
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    /**
     * Update a player
     *
     * @param player Player to be updated
     * @return Updated player
     */
    public Player updatePlayer(Player player) { return playerRepository.save(player); }

    /**
     * Get Player by Id
     * @param playerId Id of player to be fetched
     * @return Player
     */
    @Override
    public Player getPlayer(int playerId) {
        // doubt - how to handle null case i.e. if player with this Id is not present
        return playerRepository.findById(playerId).orElse(null);
    }

    /**
     * Delete player by id
     * @param playerId Id of player to be deleted
     */
    @Override
    public void deletePlayer(int playerId) {
        // we should first search the player before delete?
        playerRepository.deleteById(playerId);
    }
}
