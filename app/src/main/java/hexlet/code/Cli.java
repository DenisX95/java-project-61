package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
