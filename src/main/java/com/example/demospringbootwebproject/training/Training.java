package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Training {

    private String exercise;
    private Integer sets;
    private Integer reps;
    private Integer tempo;

}
