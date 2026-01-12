package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (choice) {
            case 1:
                Greet.run();
                break;
            case 2:
                Even.run();
                break;
            case 3:
                Calc.run();
                break;
            case 0:
                System.out.println("See you later!");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                break;
        }
        
        scanner.close();
    }
}
