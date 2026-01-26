package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String DESCRIPTION =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    private static boolean isPrime(int n) {
        final int MIN_PRIME = 2;
        if (n < MIN_PRIME) {
            return false;
        }
        for (int i = MIN_PRIME; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            String answer = isPrime(number) ? "yes" : "no";

            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = answer;
        }

        Engine.run(DESCRIPTION, questionsAnswers);
    }
}
