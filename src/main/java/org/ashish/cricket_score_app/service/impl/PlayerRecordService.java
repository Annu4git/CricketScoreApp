package org.ashish.cricket_score_app.service.impl;

import org.ashish.cricket_score_app.entity.Player;
import org.ashish.cricket_score_app.entity.PlayerRecord;
import org.ashish.cricket_score_app.repository.PlayerRepository;
import org.ashish.cricket_score_app.service.IPlayerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerRecordService implements IPlayerRecordService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    PlayerService playerService;

    @Override
    public PlayerRecord updatePlayerRecords(int playerId, PlayerRecord playerRecord) {
        Player player = playerService.getPlayer(playerId);
        player.setPlayerRecord(playerRecord);

        playerRepository.save(player);
        return playerRecord;
    }

    @Override
    public PlayerRecord getPlayerRecords(int playerId) {
        PlayerRecord playerRecords = playerService.getPlayer(playerId).getPlayerRecord();
        if(playerRecords == null) {
            throw new RuntimeException("No records has been set");
        }
        System.out.println(playerRecords);
        return playerRecords;
    }

    @Override
    public void updateTotalRuns(int playerId, int newRuns) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalRuns() + newRuns);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateTotalWickets(int playerId, int newWickets) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + newWickets);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateTotalCatches(int playerId, int newCatches) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + newCatches);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateTotalMatches(int playerId) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + 1);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateTotal50s(int playerId, int new50s) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + new50s);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateTotal100s(int playerId, int new100s) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + new100s);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateMaxRuns(int playerId, int newRuns) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + newRuns);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateMaxWickets(int playerId, int newWickets) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + newWickets);
        updatePlayerRecords(playerId, playerRecord);
    }

    @Override
    public void updateMaxCatches(int playerId, int newCatches) {
        PlayerRecord playerRecord = getPlayerRecords(playerId);
        playerRecord.setTotalRuns(playerRecord.getTotalWicket() + newCatches);
        updatePlayerRecords(playerId, playerRecord);
    }
}
