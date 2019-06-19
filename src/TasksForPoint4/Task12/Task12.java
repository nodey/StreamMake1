package TasksForPoint4.Task12;

import java.util.function.UnaryOperator;

public class Task12{
    public static void main(String[] args) {
        UnaryOperator<Integer> doubleUnaryOperator = x-> x*x;
        System.out.println(doubleUnaryOperator.apply(2));
    }
}
