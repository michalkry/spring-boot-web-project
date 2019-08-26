package com.example.demospringbootwebproject.training;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
