package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int GAME_ITERATIONS = 3;

    public static int getGameIterations() {
        return GAME_ITERATIONS;
    }

    public static void playGame(String[][] gameData, String gameDescription) {
        String[] questions = gameData[0];
        String[] answers = gameData[1];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);

        for (var i = 0; i < GAME_ITERATIONS; i++) {
            System.out.println("Question: " + questions[i]);
            var userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (answers[i].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
