package TaskForPoint4.Task13;

import java.util.function.UnaryOperator;

public class Task13 {
    public static void main(String[] args) {
        UnaryOperator<Integer> doubleUnaryOperator = x-> (++x*x);
        System.out.println(doubleUnaryOperator.apply(2));
    }
}
