package com.example.quiz.repositories;

import com.example.quiz.models.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}