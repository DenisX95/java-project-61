package hexlet.code.games;

import java.util.Random;

public class GCD {

    public static String getMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber1 = random.nextInt(100) + 1;
        var randomNumber2 = random.nextInt(100) + 1;
        return randomNumber1 + " " + randomNumber2;
    }

    public static String getCorrectAnswer(String question) {
        var numbers = question.split(" ");
        var number1 = Integer.parseInt(numbers[0]);
        var number2 = Integer.parseInt(numbers[1]);

        if(number2 > number1) {
            number1 = number1 + number2 - (number2 = number1);
        }

        while (number2 != 0) {
            var mod = number2;
            number2 = number1 % number2;
            number1 = mod;
        }
        return String.valueOf(number1);
    }
}
