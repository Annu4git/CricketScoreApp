package org.ashish.cricket_score_app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {

    private String name;

    private PlayerType playerType;
}
