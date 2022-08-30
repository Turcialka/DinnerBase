package com.example.dinnerBase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {

    private Integer restaurantId;
    private String restaurantName;
    private String restaurantCity;
    private Double restaurantRating;

    private Meal meal;
    private Opinion opinion;
}
