package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Arrays;

public class Progression {
    private static final String DESCRIPTION = 
        "What number is missing in the progression?";
    private static final int MAX_NUMBER = 50;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    
    public static void run() {
        String[][] questionsAnswers = new String[3][2];
        Random random = new Random();
        
        for (int round = 0; round < 3; round++) {
            // Генерируем прогрессию
            int first = random.nextInt(MAX_NUMBER) + 1;
            int step = random.nextInt(5) + 1; // шаг 1-5
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int hiddenIndex = random.nextInt(length);
            
            // Создаём прогрессию
            int[] progression = new int[length];
            for (int i = 0; i < length; i++) {
                progression[i] = first + i * step;
            }
            
            // Заменяем скрытое число на ".."
            StringBuilder question = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i == hiddenIndex) {
                    question.append("..");
                } else {
                    question.append(progression[i]);
                }
                if (i < length - 1) {
                    question.append(" ");
                }
            }
            
            questionsAnswers[round][0] = question.toString();
            questionsAnswers[round][1] = String.valueOf(progression[hiddenIndex]);
        }
        
        Engine.run(DESCRIPTION, questionsAnswers);
    }
}
