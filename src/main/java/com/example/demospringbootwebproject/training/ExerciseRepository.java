package com.example.demospringbootwebproject.training;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
