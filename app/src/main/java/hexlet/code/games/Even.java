package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void startEvenGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < 3; i++) {
            int number = Utils.generateNumber(1, 100);
            questions[i] = Integer.toString(number);
            correctAnswers[i] = isEven(number) ? "yes" : "no";
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
