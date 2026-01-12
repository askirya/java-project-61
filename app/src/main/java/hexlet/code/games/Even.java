package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String DESCRIPTION = 
        "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    
    public static void run() {
        String[][] questionsAnswers = new String[3][2];
        Random random = new Random();
        
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            String answer = (number % 2 == 0) ? "yes" : "no";
            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = answer;
        }
        
        Engine.run(DESCRIPTION, questionsAnswers);
    }
}
