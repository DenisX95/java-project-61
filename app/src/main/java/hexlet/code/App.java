package hexlet.code;

import java.util.Scanner;

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

        var answer = scanner.nextInt();
        System.out.println("Your choice: " + answer + "\n");

        if (answer != 0) {
            Engine.loadGame(answer);
        }
    }
}
