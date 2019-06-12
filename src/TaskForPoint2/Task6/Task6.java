package TaskForPoint2.Task6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        Integer[] values = {1, 1, 3, 4, 3, 6, 7, 8};
        Stream<Integer> integerStream = Arrays.stream(values);
        System.out.println(integerStream.distinct().collect(Collectors.toList()));
    }
}
