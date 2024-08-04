package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.User;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    static final int CODE_NAME_GREET = 1;
    static final int CODE_NAME_EVEN = 2;
    static final int CODE_NAME_CALC = 3;
    static final int CODE_NAME_GCD = 4;
    static final int CODE_NAME_PROGRESSION = 5;
    static final int CODE_NAME_PRIME = 6;
    static final int QUESTION_ITERATIONS_COUNT = 3;

    public static void loadGame(int gameCode) {
        var userName = User.getUserName();
        System.out.println("Hello, " + userName + "!");

        if (gameCode == CODE_NAME_GREET) {
            return;
        }

        System.out.println(getMessage(gameCode));

        var correctAnswersCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (correctAnswersCount != QUESTION_ITERATIONS_COUNT) {
            var question = getQuestion(gameCode);
            System.out.println("Question: " + question);

            var answer = scanner.nextLine().replace("\n", "");
            System.out.println("Your answer: " + answer);

            var correctAnswer = getCorrectAnswer(gameCode, question);

            if (answer.equals(correctAnswer)) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static String getMessage(int gameCode) {
        return switch (gameCode) {
            case CODE_NAME_EVEN -> Even.getMessage();
            case CODE_NAME_CALC -> Calc.getMessage();
            case CODE_NAME_GCD -> GCD.getMessage();
            case CODE_NAME_PROGRESSION -> Progression.getMessage();
            case CODE_NAME_PRIME -> Prime.getMessage();
            default -> null;
        };
    }

    public static String getQuestion(int gameCode) {
        return switch (gameCode) {
            case CODE_NAME_EVEN -> Even.getQuestion();
            case CODE_NAME_CALC -> Calc.getQuestion();
            case CODE_NAME_GCD -> GCD.getQuestion();
            case CODE_NAME_PROGRESSION -> Progression.getQuestion();
            case CODE_NAME_PRIME -> Prime.getQuestion();
            default -> null;
        };
    }

    public static String getCorrectAnswer(int gameCode, String question) {
        return switch (gameCode) {
            case CODE_NAME_EVEN -> Even.getCorrectAnswer(question);
            case CODE_NAME_CALC -> Calc.getCorrectAnswer(question);
            case CODE_NAME_GCD -> GCD.getCorrectAnswer(question);
            case CODE_NAME_PROGRESSION -> Progression.getCorrectAnswer(question);
            case CODE_NAME_PRIME -> Prime.getCorrectAnswer(question);
            default -> null;
        };
    }
}
