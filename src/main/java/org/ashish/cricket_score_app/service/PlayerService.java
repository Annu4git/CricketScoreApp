package org.ashish.cricket_score_app.service;

import org.ashish.cricket_score_app.entity.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    List<Player> playerList = new ArrayList<>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public List<Player> getAllPlayers() {
        return playerList;
    }

}
