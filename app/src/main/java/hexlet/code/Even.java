package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {

    public static void startEvenGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        final int answersToWin = 3;

        Random random = new Random();

        while (correctAnswersCount < answersToWin) {
            int number = random.nextInt(100) + 1;

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            String correctAnswer = isEven(number) ? "yes" : "no";

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

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
