package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void startEvenGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];


        for (int i = 0; i < 3; i++) {
            int number = Utils.generateNumber(1, 100);
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.runGame(gameDescription, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
