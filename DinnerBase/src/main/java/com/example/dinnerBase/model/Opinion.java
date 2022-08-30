package com.example.dinnerBase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Opinion {
    private Integer opinionId;
    private Double taste;
    private Double service;
    private Double cleanliness;
    private Double price;

    private Restaurant restaurant;

}
