package com.simply.Quiz_app.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "quiz_questions")
public class QuizQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    private String correctAnswer;

    @ElementCollection
    @CollectionTable(name = "question_options" , joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}
