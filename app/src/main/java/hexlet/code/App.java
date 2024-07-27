package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
            "1 - Greet\n" +
            "2 - Even\n" +
            "3 - Calc\n" +
            "4 - GCD\n" +
            "5 - Progression\n" +
            "0 - Exit");

        var answer = scanner.nextInt();
        System.out.println("Your choice: " + answer + "\n");

        if (answer != 0) {
            Engine.loadGame(answer);
        }
    }
}
