package hexlet.code;

import java.util.Scanner;

public class User {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        return scanner.nextLine();
    }
}