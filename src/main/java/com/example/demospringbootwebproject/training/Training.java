package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Training {

    private String exercise;
    private int sets;
    private int reps;
    private int tempo;

}
