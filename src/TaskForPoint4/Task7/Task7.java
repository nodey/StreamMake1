package TaskForPoint4.Task7;

import java.util.function.Predicate;

public class Task7 {
    public static void main(String[] args) {
        String s = "qwertyuioqq";
        Predicate<String> stringUnaryOperator = x-> x.matches("(.{10})");
        System.out.println(stringUnaryOperator.test(s));
    }
}