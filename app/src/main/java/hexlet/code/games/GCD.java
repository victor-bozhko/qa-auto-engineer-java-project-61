package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void startGCDGame() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[3][2];


        for (int i = 0; i < 3; i++) {
            int num1 = Utils.generateNumber(0, 100);
            int num2 = Utils.generateNumber(0, 100);
            questionsAndAnswers[i][0] = num1 + " " + num2;
            questionsAndAnswers[i][1] = Integer.toString(gcd(num1, num2));
        }

        Engine.runGame(gameDescription, questionsAndAnswers);

    }

    private static int gcd(int num1, int num2) {
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        int gcd = Math.min(a, b);

        while (gcd > 0)  {
            if (a % gcd == 0 && b % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }
}
