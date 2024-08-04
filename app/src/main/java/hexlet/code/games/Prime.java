package hexlet.code.games;

import java.util.Random;

public class Prime {

    public static String getMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber = random.nextInt(100) + 1;
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
        if (number <= 1) {
            return false;
        }

        if (number % 2 == 0) {
            return number == 2;
        }

        for (var i = 3; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}