package com.ynz.democonfigproperties.aircraft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JetFighterDTO {
    private int speed;
    private int range;
    private int weight;
    private String engine;
}
