package com.example.demospringbootwebproject.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrainingPresenter {

    @Autowired
    private TrainingProvider trainingProvider;


    @GetMapping("/trainings")
    public String getTraining(Model model){
        List<Training> trainigs = trainingProvider.getTraining();


        model.addAttribute("trainings", trainigs);
        return "trainings";

    }

}
