package TaskForPoint4.Task10;

import java.util.function.BinaryOperator;

public class Task10 {
    public static void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (x, y) -> (int)Math.pow((x + y), 2);
        System.out.println(integerBinaryOperator.apply(2, 2));
    }
}
