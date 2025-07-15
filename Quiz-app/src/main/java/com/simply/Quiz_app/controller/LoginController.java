package com.simply.Quiz_app.controller;

<<<<<<< HEAD
=======
import com.simply.Quiz_app.dto.LoginRequest;
>>>>>>> baef723285ae5cee80733639eced963fb51c1698
import com.simply.Quiz_app.entity.QuizQuestions;
import com.simply.Quiz_app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://localhost:8080")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    QuestionService questionService;

<<<<<<< HEAD
=======
    // Hardcoded credentials for now
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid username or password";
        }
    }

>>>>>>> baef723285ae5cee80733639eced963fb51c1698
    @GetMapping("/questions")
    public List<QuizQuestions> getQuestions()
    {
        return questionService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public QuizQuestions saveQuestions(@RequestBody QuizQuestions questions)
    {
        return questionService.saveQuestions(questions);
    }


}
