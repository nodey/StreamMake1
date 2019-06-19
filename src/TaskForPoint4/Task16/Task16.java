package TaskForPoint4.Task16;

import java.util.function.UnaryOperator;

public class Task16 {
    public static void main(String[] args) {
        UnaryOperator<Double> integerUnaryOperator = x-> calculate(x);
        System.out.println(integerUnaryOperator.apply((double)2));
    }

    public static Double calculate(Double x){
        return (Math.pow(x, 2) + 3 * x -1) + (3 * (Math.pow(x, 2) + 3 * x - 1))-1;
    }
}