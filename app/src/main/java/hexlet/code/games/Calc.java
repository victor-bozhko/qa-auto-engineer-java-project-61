package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void startCalcGame() {
        String gameDescription = "What is the result of the expression?";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int operation = random.nextInt(3);

            switch (operation) {
                case 0:
                    questions[i] = num1 + " + " + num2;
                    correctAnswers[i] = Integer.toString(num1 + num2);
                    break;
                case 1:
                    questions[i] = num1 + " - " + num2;
                    correctAnswers[i] = Integer.toString(num1 - num2);
                    break;
                case 2:
                    questions[i] = num1 + " * " + num2;
                    correctAnswers[i] = Integer.toString(num1 * num2);
                    break;
                default:
                    break;
            }
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
    }
}
