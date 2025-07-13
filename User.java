package com.quiz.app;

import java.util.*;

public class User {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);

    public User(List<Question> questions) {
        this.questions = questions;
    }

    public void takeQuiz() {
        int score = 0;
        long startTime = System.currentTimeMillis();

        for (Question q : questions) {
            q.displayQuestion();
            try {
                System.out.print("Your answer (1-4): ");
                int ans = Integer.parseInt(scanner.nextLine());
                if (q.isCorrect(ans)) {
                    score++;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Skipping question.");
            }
        }

        long timeTaken = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Quiz Completed!");
        System.out.println("Score: " + score + "/" + questions.size());
        System.out.println("Time Taken: " + timeTaken + " seconds");
    }
}
