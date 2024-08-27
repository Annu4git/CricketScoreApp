package org.ashish.cricket_score_app.service.impl;

import org.ashish.cricket_score_app.entity.Player;
import org.ashish.cricket_score_app.service.IPlayerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Player Service
 */
@Service
public class PlayerService implements IPlayerService {

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
     *
     * @param player
     * @param playerId
     * @return Updated player
     */
    public Player updatePlayer(Player player, int playerId) {
//        this.playerList.forEach(p -> p.);
        this.playerList.stream()
                .filter(p -> p.getId() == playerId)
                .findFirst()
                .ifPresent(p -> {
                    p.setPlayerType(player.getPlayerType());
                    p.setName(player.getName());
                });
        return player;
    }

    @Override
    public Player getPlayer(int playerId) {
        return playerList.stream()
                .filter(p -> p.getId() == playerId)
                .findFirst()
                .get();
    }
}
