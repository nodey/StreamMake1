package TaskForPoint4.Task14;

import java.util.function.UnaryOperator;

public class Task14 {
    public static void main(String[] args) {
            UnaryOperator<Integer> doubleUnaryOperator = x-> (x*x--);
            System.out.println(doubleUnaryOperator.apply(2));
    }
}
