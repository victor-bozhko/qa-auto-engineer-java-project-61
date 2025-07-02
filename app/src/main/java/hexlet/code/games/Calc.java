package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.greetUser;

public class Calc {

    public static void startCalcGame() {
        String userName = greetUser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        int correctAnswersCount = 0;
        final int answersToWin = 3;

        while (correctAnswersCount < answersToWin) {
            Random random = new Random();
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            int operation = random.nextInt(3);

            int result = 0;
            String operator = "";

            switch (operation) {
                case 0:
                    result = num1 + num2;
                    operator = "+";
                    break;
                case 1:
                    result = num1 - num2;
                    operator = "-";
                    break;
                case 2:
                    result = num1 * num2;
                    operator = "*";
                    break;
            }

            System.out.println("Question: " + num1 + " " + operator + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = result;

            if (userAnswer == correctAnswer) {
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

