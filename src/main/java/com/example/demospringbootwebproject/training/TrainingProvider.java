package com.example.demospringbootwebproject.training;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TrainingProvider {

    private Map<Long, Training> trainingMap = new HashMap<>();


    @PostConstruct

    public void initialize(){

        Training training = new Training("pull ups", 4, 10, 3002);

        trainingMap.put(1L,training);

    }

    public Training getById (Long id){
        return trainingMap.get(id);
    }


    public List<Training> getTraining(){

        return new ArrayList<>(trainingMap.values());
    }

}
