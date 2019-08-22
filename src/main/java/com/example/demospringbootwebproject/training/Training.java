package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //nie musimy ręcznie ustawiać ID, tylko bedzie automatycznie to robic
    private Long id;

    private String exercise;
    private Integer sets;
    private Integer reps;
    private Integer tempo;
    private Integer rest;

    public Training(String exercise, Integer sets, Integer reps, Integer tempo) {
        this.exercise = exercise;
        this.sets = sets;
        this.reps = reps;
        this.tempo = tempo;
    }
}
