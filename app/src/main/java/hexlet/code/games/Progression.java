package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int PROGRESSION_LENGTH = 7;
    private static final int QUESTIONS_COUNT = 3;

    public static void startProgressionGame() {
        String gameDescription = "What number is missing in the progression?";
        String[] questions = new String[QUESTIONS_COUNT];
        String[] correctAnswers = new String[QUESTIONS_COUNT];

        Random random = new Random();

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int start = random.nextInt(11);
            int step = random.nextInt(3, 9);
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            String[] progression = makeProgression(start, step);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            questions[i] = question;
            correctAnswers[i] = answer;
        }

        Engine.runGame(gameDescription, questions, correctAnswers);
    }

    private static String[] makeProgression(int start, int step) {
        String[] progression = new String[Progression.PROGRESSION_LENGTH];
        for (int j = 0; j < Progression.PROGRESSION_LENGTH; j++) {
            progression[j] = String.valueOf(start + j * step);
        }
        return progression;
    }
}
