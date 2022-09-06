package com.example.dinnerBase.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    @NotNull
    @Size(max =  128)
    private String restaurantName;

    @NotNull
    @Size(max =  128)
    private String restaurantCity;

    @NotNull
    @Size(max =  128)
    private Double restaurantRating;

    @NotNull
    @OneToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Meal meal;

    @NotNull
    @OneToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Opinion opinion;
}
