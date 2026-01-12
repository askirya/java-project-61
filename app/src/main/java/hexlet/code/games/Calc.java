package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = 
        "What is the result of the expression?";
    private static final int MAX_NUMBER = 25;
    private static final String[] OPERATIONS = {"+", "-", "*"};
    
    public static void run() {
        String[][] questionsAnswers = new String[3][2];
        Random random = new Random();
        
        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;
            String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];
            
            String question = num1 + " " + operation + " " + num2;
            int result = switch (operation) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                default -> 0;
            };
            
            questionsAnswers[i][0] = question;
            questionsAnswers[i][1] = String.valueOf(result);
        }
        
        Engine.run(DESCRIPTION, questionsAnswers);
    }
}
