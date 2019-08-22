package com.example.demospringbootwebproject.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/training")
public class TrainingController {

    private TrainingRepository trainingRepository;

    @Autowired
    public TrainingController(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    @GetMapping("/all")
    public String getTraining(Model model){
        List<Training> trainigs = trainingRepository.findAll();
        model.addAttribute("trainings", trainigs);

        return "trainings";
    }

    @GetMapping("/add")
    public String redirectToNewPage(){
        return "addTraining";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Training training, Model model){

        trainingRepository.save(training);
        List<Training> trainigs = trainingRepository.findAll();
        model.addAttribute("trainings", trainigs);

        return "trainings";

    }

    @ModelAttribute("training")
    public Training createModel() {
        return new Training();
    }


}
