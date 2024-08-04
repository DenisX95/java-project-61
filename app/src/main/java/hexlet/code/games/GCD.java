package hexlet.code.games;

import java.util.Random;

public class GCD {
    static final int MAX_NUMERIC_VALUE = 100;

    public static String getMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber1 = random.nextInt(MAX_NUMERIC_VALUE) + 1;
        var randomNumber2 = random.nextInt(MAX_NUMERIC_VALUE) + 1;
        return randomNumber1 + " " + randomNumber2;
    }

    public static String getCorrectAnswer(String question) {
        var numbers = question.split(" ");
        var number1 = Integer.parseInt(numbers[0]);
        var number2 = Integer.parseInt(numbers[1]);

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
        return String.valueOf(number1);
    }
}
