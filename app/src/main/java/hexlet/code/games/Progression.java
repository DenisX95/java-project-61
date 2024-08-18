package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import java.util.StringJoiner;

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
            var undefinedPosition = Util.getRandomNumber(PROGRESSION_ITEMS_COUNT) - 1;
            String[] progression = generateProgression();
            answers[i] = progression[undefinedPosition];
            progression[undefinedPosition] = "..";
            questions[i] = progressionToString(progression);
        }

        return gameData;
    }

    public static String[] generateProgression() {
        var currentNumber = Util.getRandomNumber(FIRST_NUM_VALUE_RANGE);
        var progressionStep = Util.getRandomNumber(PROGRESSION_STEP_RANGE);
        String[] progression = new String[PROGRESSION_ITEMS_COUNT];

        for(var i = 0; i < PROGRESSION_ITEMS_COUNT; i++) {
            progression[i] = String.valueOf(currentNumber);
            currentNumber += progressionStep;
        }

        return progression;
    }

    public static String progressionToString(String[] progression) {
        var resultString = new StringJoiner(" ");

        for (var i = 0; i < PROGRESSION_ITEMS_COUNT; i++) {
            resultString.add(progression[i]);
        }

        return resultString.toString();
    }
}
