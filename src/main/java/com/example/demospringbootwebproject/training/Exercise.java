package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exercise {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer sets;
    private Integer reps;
    private Integer tempo;
    private Integer rest;

    @ManyToOne
    @JoinColumn(name = "trainingId")
    private Training training;

}

