package com.example.quiz.services;

import com.example.quiz.models.Question;
import com.example.quiz.repositories.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(long questionId) {
        return questionRepository.findById(questionId).orElse(null);
    }

    @Override
    public void deleteQuestion(long id) {
       questionRepository.deleteById(id);
    }
}
