package TasksForPoint4.Task15;

import java.util.function.UnaryOperator;

public class Task15 {
    public static void main(String[] args) {
        UnaryOperator<Double> integerUnaryOperator = x-> calculate(x);
        System.out.println(integerUnaryOperator.apply((double)2));
    }

    public static Double calculate(Double x){
        return Math.pow(x, 2) + 3 * x -1;
    }
}
