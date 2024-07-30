package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.User;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static void loadGame(int gameCode) {
        var userName = User.getUserName();
        System.out.println("Hello, " + userName + "!");

        if (gameCode == 1) {
            return;
        }

        System.out.println(getMessage(gameCode));

        var correctAnswersCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (correctAnswersCount != 3) {
            var question = getQuestion(gameCode);
            System.out.println("Question: " + question);

            var answer = scanner.nextLine().replace("\n", "");
            System.out.println("Your answer: " + answer);

            var correctAnswer = getCorrectAnswer(gameCode, question);

            if (answer.equals(correctAnswer)) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                        "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static String getMessage(int gameCode) {
        return switch (gameCode) {
            case 2 -> Even.getMessage();
            case 3 -> Calc.getMessage();
            case 4 -> GCD.getMessage();
            case 5 -> Progression.getMessage();
            case 6 -> Prime.getMessage();
            default -> null;
        };
    }

    public static String getQuestion(int gameCode) {
        return switch (gameCode) {
            case 2 -> Even.getQuestion();
            case 3 -> Calc.getQuestion();
            case 4 -> GCD.getQuestion();
            case 5 -> Progression.getQuestion();
            case 6 -> Prime.getQuestion();
            default -> null;
        };
    }

    public static String getCorrectAnswer(int gameCode, String question) {
        return switch (gameCode) {
            case 2 -> Even.getCorrectAnswer(question);
            case 3 -> Calc.getCorrectAnswer(question);
            case 4 -> GCD.getCorrectAnswer(question);
            case 5 -> Progression.getCorrectAnswer(question);
            case 6 -> Prime.getCorrectAnswer(question);
            default -> null;
        };
    }
}