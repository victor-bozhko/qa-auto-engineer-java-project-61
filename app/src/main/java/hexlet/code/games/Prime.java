package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Prime {
    public static void startPrimeGame() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < 3; i++) {
            int number = Utils.generateNumber(0, 25) * 2 + 1;
            questions[i] = Integer.toString(number);
            correctAnswers[i] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
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
