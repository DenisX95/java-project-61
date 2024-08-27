package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    static final int MAX_NUMERIC_VALUE = 100;
    static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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
            var randomNumber = Util.getRandomNumber(MAX_NUMERIC_VALUE);
            questions[i] = String.valueOf(randomNumber);
            answers[i] = isPrime(randomNumber) ? "yes" : "no";
        }

        return gameData;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
