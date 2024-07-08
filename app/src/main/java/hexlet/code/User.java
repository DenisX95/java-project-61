package hexlet.code;

import java.util.Scanner;

public class User {
    private String userName;

    public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        userName = scanner.nextLine();
    }

    public String getUserName() {
        return userName;
    }

    public void greetUser() {
        System.out.println("Hello, "+ userName +"!");
    }
}