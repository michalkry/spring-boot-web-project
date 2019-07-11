package com.example.demospringbootwebproject.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/training")
@Controller
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/all")
    public String getTraining(Model model){
        List<Training> trainigs = trainingService.getTraining();
        model.addAttribute("trainings", trainigs);

        return "trainings";
    }

    @GetMapping("/add")
    public String redirectToNewPage(){
        return "addTraining";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Training training, Model model){

        trainingService.saveExercise(training);
        List<Training> trainigs = trainingService.getTraining();
        model.addAttribute("trainings", trainigs);

        return "trainings";

    }

    @ModelAttribute("training")
    public Training createModel() {
        return new Training();
    }


}
