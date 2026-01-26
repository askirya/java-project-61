package hexlet.code.games;

public class Greet {
    public static void run() {
        System.out.println("Welcome to the Brain Games!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Can I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
