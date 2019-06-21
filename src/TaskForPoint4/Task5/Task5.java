package TaskForPoint4.Task5;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        String s = "gritvian@mail.ru";

        Predicate<String> integerBinaryOperator = x-> x.matches(".+@.+\\.[a-z]+");
        System.out.println(integerBinaryOperator.test(s));
    }
}
