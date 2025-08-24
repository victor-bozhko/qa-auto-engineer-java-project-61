package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void startPrimeGame() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];


        for (int i = 0; i < 3; i++) {
            int number = Utils.generateNumber(0, 25) * 2 + 1;
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(gameDescription, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
