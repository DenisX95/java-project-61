package hexlet.code.games;

import java.util.Random;

public class Prime {
    static final int MAX_NUMERIC_VALUE = 100;

    public static String getMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber = random.nextInt(MAX_NUMERIC_VALUE) + 1;
        return String.valueOf(randomNumber);
    }

    public static String getCorrectAnswer(String question) {
        if (isPrime(Integer.parseInt(question))) {
            return "yes";
        } else {
            return "no";
        }
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
