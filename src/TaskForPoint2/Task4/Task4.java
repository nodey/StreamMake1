package TaskForPoint2.Task4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        Stream<Integer> integerStream = Arrays.stream(values);
        System.out.println("integerStreamWithoutFirstFourValue: " + integerStream.skip(4).collect(Collectors.toList()));
    }
}
