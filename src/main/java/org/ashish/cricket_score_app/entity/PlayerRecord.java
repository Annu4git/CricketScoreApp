package org.ashish.cricket_score_app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="records")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// had to add below annotation as getPlayerRecord by playerId was not giving the corresponding PlayerRecord object
// using player table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PlayerRecord {

    @Id
    @Column(name = "record_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int totalRuns;
    private int totalWicket;
    private int totalCatches;
    private int totalMatches;
    private int total50s;
    private int total100s;
    private int maxRuns;
    private int maxWickets;
    private int maxCatches;
}
