package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String DESCRIPTION =
             "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void run() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;

            int gcd = findGcd(num1, num2);

            questionsAnswers[i][0] = num1 + " " + num2;
            questionsAnswers[i][1] = String.valueOf(gcd);
        }

        Engine.run(DESCRIPTION, questionsAnswers);
    }
}
