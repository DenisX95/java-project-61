package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    static final int MAX_NUMERIC_VALUE = 100;
    static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        String[][] gameData = generateGameData();
        Engine.playGame(gameData, GAME_DESCRIPTION);
    }

    public static String[][] generateGameData() {
        var gameIterations = Engine.getGameIterations();
        String[] questions = new String[gameIterations];
        String[] answers = new String[gameIterations];
        String[][] gameData = {questions, answers};

        for (var i = 0; i < gameIterations; i++) {
            var randomNumber1 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            var randomNumber2 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            questions[i] = randomNumber1 + " " + randomNumber2;
            answers[i] = String.valueOf(getGCD(randomNumber1, randomNumber2));
        }

        return gameData;
    }

    public static int getGCD (int number1, int number2) {
        if (number2 > number1) {
            var transitNumber = number1;
            number1 = number2;
            number2 = transitNumber;
        }

        while (number2 != 0) {
            var mod = number2;
            number2 = number1 % number2;
            number1 = mod;
        }
        return number1;
    }
}
