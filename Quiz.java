package com.quiz.app;

import java.util.*;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {
        questions.add(new Question("What is Java?", new String[]{"OS", "Programming Language", "Game", "IDE"}, 2));
        questions.add(new Question("Who developed Java?", new String[]{"Microsoft", "Sun Microsystems", "Apple", "IBM"}, 2));
    }

    public void start() {
        System.out.println("Welcome to the Quiz App!");
        System.out.print("Enter your role (admin/user): ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            Admin admin = new Admin(questions);
            admin.manageQuestions();
        } else {
            User user = new User(questions);
            user.takeQuiz();
        }
    }
}
