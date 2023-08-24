package com.example.quiz.services;

import com.example.quiz.models.Question;
import java.util.List;

public interface QuestionService {

    Question save(Question question);

    List<Question> getAllQuestions();

    Question getQuestionById(long questionId);

    void deleteQuestion(long id);
}
