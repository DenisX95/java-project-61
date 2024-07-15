package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String getMessage() {
        return "What is the result of the expression?";
    }

    public static String getQuestion() {
        Random random = new Random();
        var operand1 = random.nextInt(101);
        var operand2 = random.nextInt(101);
        var operationSigh = getOperationSigh();
        return operand1 + " " + operationSigh + " " + operand2;
    }

    public static String getCorrectAnswer(String question) {
        var operationElements = question.split(" ");
        var operand1 = Integer.parseInt(operationElements[0]);
        var operand2 = Integer.parseInt(operationElements[2]);

        return switch (operationElements[1]) {
            case "+" -> String.valueOf(operand1 + operand2);
            case "-" -> String.valueOf(operand1 - operand2);
            case "*" -> String.valueOf(operand1 * operand2);
            default -> null;
        };
    }

    public static String getOperationSigh() {
        Random random = new Random();
        var signID = random.nextInt(3) + 1;

        return switch (signID) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> null;
        };
    }
}
