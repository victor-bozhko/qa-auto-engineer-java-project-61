package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String gameDescription, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameDescription);

        int correctAnswersCount = 0;
        final int answersToWin = 3;

        for (String[] questionsAndAnswer : questionsAndAnswers) {
            if (correctAnswersCount >= answersToWin) {
                break;
            }

            String question = questionsAndAnswer[0];
            String correctAnswer = questionsAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
