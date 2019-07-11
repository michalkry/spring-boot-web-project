package com.example.demospringbootwebproject.training;


import com.example.demospringbootwebproject.athlete.Athlete;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TrainingService {

    private Map<Long, Training> trainingMap = new HashMap<>();
    private Long counter;

    @PostConstruct
    public void initialize() {
        counter = 2L;
        Training training = new Training("pull ups", 4, 10, 3002);
        trainingMap.put(1L, training);
    }

    public Training getById(Long id) {
        return trainingMap.get(id);
    }

    public List<Training> getTraining() {
        return new ArrayList<>(trainingMap.values());
    }

    public void saveExercise(Training training) {
        trainingMap.put(counter, training);
        counter++;
    }


}
