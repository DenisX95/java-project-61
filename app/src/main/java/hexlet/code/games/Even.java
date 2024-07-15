package hexlet.code.games;

import java.util.Random;

public class Even {

    public static String getMessage() {
        return "\"Answer 'yes' if the number is even, otherwise answer 'no'.\"";
    }

    public static String getQuestion() {
        Random random = new Random();
        var randomNumber = random.nextInt(101);
        return randomNumber + "\n"
    }

    public static String getCorrectAnswer(String question) {

    }

    public static void checkParity () {
        User user = new User();
        user.greetUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (correctAnswersCount != 3) {


            if (answer.equals("yes") && randomNumber % 2 == 0) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else if(answer.equals("no") && randomNumber % 2 != 0) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else {
                var correctAnswer = answer.equals("yes") ? "no" : "yes";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + user.getUserName() + "!");
                return;
            }

            System.out.println("Congratulations, " + user.getUserName() + "!");
        }
    }
}