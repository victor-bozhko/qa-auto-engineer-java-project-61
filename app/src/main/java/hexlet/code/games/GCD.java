package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void startGCDGame() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(101);
            int num2 = random.nextInt(101);
            questions[i] = num1 + " " + num2;
            correctAnswers[i] = Integer.toString(findDivider(num1, num2));
        }

        Engine.runGame(gameDescription, questions, correctAnswers);

    }

    private static int findDivider(int num1, int num2) {
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        int gcd = Math.min(a, b);

        while (gcd > 0)  {
            if(a % gcd == 0 && b % gcd == 00) {
                break;
            }
            gcd--;
        }
        return gcd;
    }
}
