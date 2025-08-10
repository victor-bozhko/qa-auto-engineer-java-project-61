package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void startProgressionGame() {
        String gameDescription = "What number is missing in the progression?";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int start = random.nextInt(11);
            int step = random.nextInt(3,9);
            int hiddenIndex = random.nextInt(7);

            int[] progression = new int[7];

            for (int j = 0; j < 7; j++) {
                progression[j] = start + j * step;
            }

            String[] stringWithMissingElement = new String[7];
            for (int j = 0; j < 7; j++) {
                if (j == hiddenIndex) {
                    stringWithMissingElement[j] = "..";
                } else {
                    stringWithMissingElement[j] = String.valueOf(progression[j]);
                }
            }

            String question = "";
            for (int j = 0; j < stringWithMissingElement.length; j++) {
                question += stringWithMissingElement[j];
                if (j < stringWithMissingElement.length - 1) {
                    question += " ";
                }
            }

            questions[i] = question;
            correctAnswers[i] = String.valueOf(progression[hiddenIndex]);
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
    }
}
