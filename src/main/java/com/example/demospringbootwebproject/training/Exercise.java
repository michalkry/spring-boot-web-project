package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String exercise;
    private Integer sets;
    private Integer reps;
    private Integer tempo;
    private Integer rest;




    @ManyToOne
    @JoinColumn (name = "trainingId")
    private Training training;




    }

