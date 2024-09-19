package org.ashish.cricket_score_app.service;

import org.ashish.cricket_score_app.entity.PlayerRecord;

public interface IPlayerRecordService {

    PlayerRecord updatePlayerRecords(int playerId, PlayerRecord playerRecord);

    // Method to update player records
    PlayerRecord getPlayerRecords(int playerId);

    // Method to update total runs
    void updateTotalRuns(int playerId, int newRuns);

    // Method to update total wickets
    void updateTotalWickets(int playerId, int newWickets);

    // Method to update total catches
    void updateTotalCatches(int playerId, int newCatches);

    // Method to update total matches
    void updateTotalMatches(int playerId);

    // Method to update total 50s
    void updateTotal50s(int playerId, int new50s);

    // Method to update total 100s
    void updateTotal100s(int playerId, int new100s);

    // Method to update max runs
    void updateMaxRuns(int playerId, int newRuns);

    // Method to update max wickets
    void updateMaxWickets(int playerId, int newWickets);

    // Method to update max catches
    void updateMaxCatches(int playerId, int newCatches);
}
