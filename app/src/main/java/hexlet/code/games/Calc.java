package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    static final int MAX_NUMERIC_VALUE = 100;
    static final String GAME_DESCRIPTION = "What is the result of the expression?";

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, GAME_DESCRIPTION);
    }

    public static String[][] generateGameData() {
        var gameIterations = Engine.getGameIterations();
        String[] questions = new String[gameIterations];
        String[] answers = new String[gameIterations];
        String[][] gameData = {questions, answers};
        String[] mathSigns = {"+", "-", "*"};

        for (var i = 0; i < gameIterations; i++) {
            var randomNumber1 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            var randomNumber2 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            var signNumber = Util.getRandomNumber(mathSigns.length) - 1;
            questions[i] = randomNumber1 + " " + mathSigns[signNumber] + " " + randomNumber2;
            answers[i] = String.valueOf(calcNumbers(randomNumber1, randomNumber2, mathSigns[signNumber]));
        }

        return gameData;
    }

    public static int calcNumbers(int number1, int number2, String sign) {
        return switch (sign) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
    }
}
