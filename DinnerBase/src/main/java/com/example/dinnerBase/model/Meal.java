package com.example.dinnerBase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Meal {

    private Integer mealId;
    private String mealName;
    private Double mealRating;

    private Restaurant restaurant;

}
