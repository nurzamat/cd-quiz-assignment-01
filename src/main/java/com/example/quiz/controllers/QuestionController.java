package com.example.quiz.controllers;


import com.example.quiz.models.Question;
import com.example.quiz.services.QuestionService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping({"/{questionId}"})
    public ResponseEntity<Question> getQuestionById(@PathVariable Long questionId) {
        return new ResponseEntity<>(questionService.getQuestionById(questionId), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        Question question1 = questionService.save(question);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("question", "/api/questions/" + question1.getId().toString());
        return new ResponseEntity<>(question1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{questionId}"})
    public ResponseEntity<Question> updateQuestion(@PathVariable("questionId") Long questionId, @RequestBody Question question) {
        question.setId(questionId);
        return new ResponseEntity<>(questionService.save(question), HttpStatus.OK);
    }

    @DeleteMapping({"/{questionId}"})
    public ResponseEntity<Question> deleteQuestion(@PathVariable("questionId") Long questionId) {
        questionService.deleteQuestion(questionId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
