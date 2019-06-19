package TaskForPoint4.Task3;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Task3 {
    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = x-> x + "BAR";
        System.out.println(stringUnaryOperator.apply("Hello" + " "));
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Have a nice day");
    }

}
