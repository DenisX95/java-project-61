package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        var answer = scanner.nextLine();
        System.out.println("Your choice: " + answer + "\n");

        switch (answer) {
            case "1" -> Cli.greetTheUser();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> throw new IllegalStateException("Unexpected value: " + answer);
        }
    }
}
