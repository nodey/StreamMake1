package TaskForPoint4.Task9;

import java.util.function.BinaryOperator;

public class Task9 {
    public static void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (x, y) -> x + y;
        System.out.println(integerBinaryOperator.apply(1, 2));
    }
}
