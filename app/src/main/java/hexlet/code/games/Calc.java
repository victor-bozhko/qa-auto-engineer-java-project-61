package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void startCalcGame() {
        String gameDescription = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int num1 = Utils.generateNumber(0, 10);
            int num2 = Utils.generateNumber(0, 10);
            String operators = "+-*";
            int operationIndex = Utils.generateNumber(0, 2);
            char operation = operators.charAt(operationIndex);

            switch (operation) {
                case '+':
                    questionsAndAnswers[i][0] = num1 + " + " + num2;
                    questionsAndAnswers[i][1] = Integer.toString(num1 + num2);
                    break;
                case '-':
                    questionsAndAnswers[i][0] = num1 + " - " + num2;
                    questionsAndAnswers[i][1] = Integer.toString(num1 - num2);
                    break;
                case '*':
                    questionsAndAnswers[i][0] = num1 + " * " + num2;
                    questionsAndAnswers[i][1] = Integer.toString(num1 * num2);
                    break;
                default:
                    throw new RuntimeException("Unknown user choice" + operation);
            }
        }

        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < 3; i++) {
            questions[i] = questionsAndAnswers[i][0];
            correctAnswers[i] = questionsAndAnswers[i][1];
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
    }
}
