package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION =
            "What number is missing in the progression?";
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 5;
    private static final int PROGRESSION_LENGTH = 10;

    public static void run() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = random.nextInt(MAX_START) + 1;
            int step = random.nextInt(MAX_STEP) + 1;
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);
            int[] progression = generateProgression(start, step, PROGRESSION_LENGTH);
            int correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = -1;

            String[] progressionStr = new String[progression.length];
            for (int j = 0; j < progression.length; j++) {
                progressionStr[j] = progression[j] == -1 ? ".." : String.valueOf(progression[j]);
            }
            String question = String.join(" ", progressionStr);

            questionsAnswers[i][0] = question;
            questionsAnswers[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run(DESCRIPTION, questionsAnswers);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
