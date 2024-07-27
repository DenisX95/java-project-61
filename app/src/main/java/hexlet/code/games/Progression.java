package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static String getMessage() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        Random random = new Random();
        var currentNumber = random.nextInt(20) + 1;
        var progressionStep = random.nextInt(10) + 1;
        var posUndefinedNum = random.nextInt(10) + 1;
        String progression = String.valueOf(currentNumber);

        for (var i = 1; i < 10; i++) {
            currentNumber += progressionStep;
            progression += (i != posUndefinedNum) ? (" " + currentNumber) : " ..";
        }

        return progression;
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
