package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    static final int FIRST_NUM_VALUE_RANGE = 20;
    static final int PROGRESSION_STEP_RANGE = 10;
    static final int PROGRESSION_ITEMS_COUNT = 10;
    static final String GAME_DESCRIPTION = "What number is missing in the progression?";

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
            var firstValue = Util.getRandomNumber(FIRST_NUM_VALUE_RANGE);
            var step = Util.getRandomNumber(PROGRESSION_STEP_RANGE);
            String[] progression = generateProgression(firstValue, step, PROGRESSION_ITEMS_COUNT);
            var undefinedPosition = Util.getRandomNumber(PROGRESSION_ITEMS_COUNT) - 1;

            answers[i] = progression[undefinedPosition];
            progression[undefinedPosition] = "..";
            questions[i] = String.join(" ", progression);
        }

        return gameData;
    }

    public static String[] generateProgression(int firstValue, int step, int length) {
        String[] progression = new String[length];

        for (var i = 0; i < length; i++) {
            progression[i] = String.valueOf(firstValue + i * step);
        }

        return progression;
    }
}
