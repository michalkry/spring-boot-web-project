package com.example.demospringbootwebproject.training;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/exercise")
public class ExerciseController {

    private final ExerciseRepository exerciseRepository;

    public ExerciseController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }


    @GetMapping("/all")
    public String getExercise(Model model){
        List<Exercise> exercisesList = exerciseRepository.findAll();
        model.addAttribute("exercises", exercisesList);

        return "exercises";
    }

    @ModelAttribute("exercise")
    public Exercise createModel() {
        return new Exercise();
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Exercise exercise, Model model){

        exerciseRepository.save(exercise);
        List<Exercise> exercises = exerciseRepository.findAll();
        model.addAttribute("exercises", exercises);

        return "addExercise";

    }

    @GetMapping("/add")
    public String redirectToNewPage(){
        return "addExercise";
    }


}
