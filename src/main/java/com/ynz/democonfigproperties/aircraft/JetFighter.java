package com.ynz.democonfigproperties.aircraft;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Data
public class JetFighter {
    @Min(value = 0, message = "Speed must be bigger than zero")
    private int speed;
    @Min(value = 0, message = "Range must be bigger than zero")
    private int range;
    @Min(value = 0, message = "Range must be bigger than zero")
    private int weight;
    @NotBlank(message = "Engine description is compulsory")
    private String engine;
}
