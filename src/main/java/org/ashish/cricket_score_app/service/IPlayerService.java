package org.ashish.cricket_score_app.service;

import org.ashish.cricket_score_app.entity.Player;

import java.util.List;

public interface IPlayerService {

    void addPlayer(Player player);

    List<Player> getAllPlayers();

    Player updatePlayer(Player player);

    Player getPlayer(int playerId);

    void deletePlayer(int playerId);
}
