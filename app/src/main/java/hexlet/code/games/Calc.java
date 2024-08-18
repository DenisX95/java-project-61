package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    static final int MAX_NUMERIC_VALUE = 100;
    static final int OPERATORS_COUNT = 3;
    static final int ADDITION_CODE = 1;
    static final int SUBTRACTION_CODE = 2;
    static final int MULTIPLICATION_CODE = 3;
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

        for (var i = 0; i < gameIterations; i++) {
            var randomNumber1 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            var randomNumber2 = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            var operationNumber = Util.getRandomNumber(OPERATORS_COUNT);

            switch (operationNumber) {
                case ADDITION_CODE -> {
                    questions[i] = randomNumber1 + " + " + randomNumber2;
                    answers[i] = String.valueOf(randomNumber1 + randomNumber2);
                }
                case SUBTRACTION_CODE -> {
                    questions[i] = randomNumber1 + " - " + randomNumber2;
                    answers[i] = String.valueOf(randomNumber1 - randomNumber2);
                }
                case MULTIPLICATION_CODE -> {
                    questions[i] = randomNumber1 + " * " + randomNumber2;
                    answers[i] = String.valueOf(randomNumber1 * randomNumber2);
                }
            }
        }

        return gameData;
    }
}
