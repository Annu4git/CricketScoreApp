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
    @Enumerated(EnumType.STRING)
    private PlayerType playerType;

    // One-to-one relationship with Record
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "record_id")
    private PlayerRecord playerRecord;
}
