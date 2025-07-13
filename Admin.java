package com.quiz.app;

import java.util.*;

public class Admin {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);

    public Admin(List<Question> questions) {
        this.questions = questions;
    }

    public void manageQuestions() {
        System.out.println(\"Admin Mode: Manage Questions\");

        while (true) {
            System.out.println(\"1. Add Question\\n2. Exit\");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print(\"Enter question: \");
                String question = scanner.nextLine();
                String[] options = new String[4];
                for (int i = 0; i < 4; i++) {
                    System.out.print(\"Enter option \" + (i + 1) + \": \");
                    options[i] = scanner.nextLine();
                }
                System.out.print(\"Enter correct option number (1-4): \");
                int correct = Integer.parseInt(scanner.nextLine());
                questions.add(new Question(question, options, correct));
            } else {
                break;
            }
        }
    }
}
