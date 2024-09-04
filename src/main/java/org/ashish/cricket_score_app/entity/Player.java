package org.ashish.cricket_score_app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="player")
@Getter
@Setter
@AllArgsConstructor
// is this ok for default constructor
@NoArgsConstructor
public class Player {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    // doubt - type is not getting stored as string it is storing as number (1 or 2)
    private PlayerType playerType;

    //@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    //@JoinColumn(name = "record_id")
    //private PlayerRecords records;

    // One-to-one relationship with Record
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private PlayerRecords records;
}
