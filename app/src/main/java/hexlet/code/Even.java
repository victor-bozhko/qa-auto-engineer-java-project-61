package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetUser;

public class Even {

    public static void startEvenGame() {
        String userName = greetUser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        final int answersToWin = 3;

        while (correctAnswersCount < answersToWin) {
            int number = (int) (Math.random() * 1001);

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
