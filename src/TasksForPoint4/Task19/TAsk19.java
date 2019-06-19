package TasksForPoint4.Task19;

import java.util.function.DoubleFunction;
import java.util.function.Function;

public class TAsk19 {
    public static void main(String[] args) {
        System.out.println();

        Function<Double, DoubleFunction<Double>> biFunction = x-> z-> Math.pow(z, x);
        System.out.println(biFunction.apply(10.0).apply(2.0));
    }
}
