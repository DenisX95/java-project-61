package hexlet.code.games;

import java.util.Random;

public class Even {

    public static String getMessage() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber = random.nextInt(101);
        return String.valueOf(randomNumber);
    }

    public static String getCorrectAnswer(String question) {
        var randomNumber = Integer.parseInt(question);
        if (randomNumber % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}