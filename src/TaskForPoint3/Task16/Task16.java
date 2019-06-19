package TaskForPoint3.Task16;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task16 {
    public static void main(String[] args) {
        final double alpha = 0.1D;

        Random random = new Random();
        Double[] resultMethodical = new Double[5];
        for (int i = 0; i < resultMethodical.length; i++) {
            double current = random.nextDouble();

            resultMethodical[i] = (-(1.0 / alpha)) * Math.log(current);

            System.out.println(resultMethodical[i]);
        }

        List<Double> doubles = Arrays.asList(resultMethodical);


        System.out.println("Minimal value: " + doubles.stream().min(Double::compareTo).get());
        System.out.println("Maximum value: " + doubles.stream().max(Double::compareTo).get());
        System.out.println("Middle value: "  + doubles.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
        System.out.println("Sum of values: " + doubles.stream().mapToDouble(Double::doubleValue).sum());
    }
}