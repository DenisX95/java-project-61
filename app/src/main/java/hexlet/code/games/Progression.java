package hexlet.code.games;

import java.util.Random;

public class Progression {
    static final int FIRST_NUM_VALUE_RANGE = 20;
    static final int PROGRESSION_STEP_RANGE = 10;
    static final int PROGRESSION_ITEMS_COUNT = 10;

    public static String getMessage() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        Random random = new Random();

        var currentNumber = random.nextInt(FIRST_NUM_VALUE_RANGE) + 1;
        var progressionStep = random.nextInt(PROGRESSION_STEP_RANGE) + 1;
        var posUndefinedNum = random.nextInt(PROGRESSION_ITEMS_COUNT);
        var progression = "";

        for (var i = 0; i < PROGRESSION_ITEMS_COUNT; i++) {
            progression += (i != posUndefinedNum) ? (" " + currentNumber) : " ..";
            currentNumber += progressionStep;
        }

        return progression.substring(1);
    }

    public static String getCorrectAnswer(String question) {
        var progressionArray = question.split(" ");
        var posUndefinedNum = getIndexOfElement(progressionArray, "..");
        var previousNum1 = 0;
        var previousNum2 = 0;

        if (posUndefinedNum > 1) {
            previousNum1 = Integer.parseInt(progressionArray[posUndefinedNum - 1]);
            previousNum2 = Integer.parseInt(progressionArray[posUndefinedNum - 2]);
        } else {
            previousNum1 = Integer.parseInt(progressionArray[posUndefinedNum + 1]);
            previousNum2 = Integer.parseInt(progressionArray[posUndefinedNum + 2]);
        }

        var progressionStep = previousNum1 - previousNum2;
        return String.valueOf(previousNum1 + progressionStep);
    }

    public static int getIndexOfElement(String[] elements, String searchElement) {
        for (var i = 0; i < elements.length; i++) {
            if (elements[i].equals(searchElement)) {
                return i;
            }
        }
        return -1;
    }

}
