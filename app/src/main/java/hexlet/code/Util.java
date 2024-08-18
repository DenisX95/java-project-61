package hexlet.code;

public class Util {
    final static int MIN_VALUE = 1;

    public static int getRandomNumber(int maxValue) {
        return (int) Math.floor(Math.random() * (maxValue - MIN_VALUE + 1) + MIN_VALUE);
    }
}
