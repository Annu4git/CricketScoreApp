package org.ashish.cricket_score_app.entity;

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
public class PlayerRecords {

    @Id
    @Column(name = "record_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // @OneToOne(mappedBy = "records", cascade = CascadeType.ALL,fetch = FetchType.LAZY)  // record is the name of Java class property(player class) not a table column
   // private Player player;   // to make OneToOne relation Bi-directional

   // One-to-one relationship with Player
   @OneToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "player_id")
   private Player player;
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
