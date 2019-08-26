package com.example.demospringbootwebproject.training;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //nie musimy ręcznie ustawiać ID, tylko bedzie automatycznie to robic
    private Long id;

    private String typeOfTraining;

    @OneToMany(mappedBy = "training", fetch = FetchType.LAZY)
    private List<Exercise> exercises;


    }

