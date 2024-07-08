package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
            + "1 - Greet\n"
            + "2 - Even\n"
            + "0 - Exit");

        var answer = scanner.nextInt();
        System.out.println("Your choice: " + answer + "\n");

        switch (answer) {
            case 0:
                return;
            case 1:
                User user = new User();
                user.greetUser();
                break;
            case 2:
                CheckParityGame.checkParity();
                break;
        }
    }
}
