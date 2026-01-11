package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        
        boolean isWin = true;
        
        for (int round = 1; round <= ROUNDS_COUNT; round++) {
            int number = random.nextInt(MAX_NUMBER) + 1; // 1-100
            System.out.println("Question: " + number);
            
            String answer = scanner.nextLine().trim().toLowerCase();
            
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                isWin = false;
                break;
            } else {
                System.out.println("Correct!");
            }
        }
        
        if (isWin) {
            System.out.println("Congratulations, " + name + "!");
        }
        
        scanner.close();
    }
}
