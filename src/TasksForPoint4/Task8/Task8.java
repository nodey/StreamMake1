package TasksForPoint4.Task8;

import java.util.function.Predicate;

public class Task8 {
    public static void main(String[] args) {
        int value = 123;
        Predicate<Integer> integerUnaryOperator = x->isNumberFromFibonacciSequence(x);
        System.out.println(integerUnaryOperator.test(value));
    }

    public static boolean isNumberFromFibonacciSequence(int num){
        if (num == 0 || num == 1){
            return true;
        }
        else {
            return isPerfectSquare( 5*num*num - 4) || isPerfectSquare(5*num*num - 4);
        }
    }

    private static boolean isPerfectSquare(int num){
        double sqrt = Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
