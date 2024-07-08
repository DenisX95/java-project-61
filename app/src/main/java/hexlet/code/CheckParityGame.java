package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class CheckParityGame {
    public static void checkParity () {
        User user = new User();
        user.greetUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var correctAnswersCount = 0;
        var randomNumber = 0;
        var answer = "";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (correctAnswersCount != 3) {
            randomNumber = random.nextInt(101);
            System.out.print("Question: " + randomNumber + "\n");
            answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

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