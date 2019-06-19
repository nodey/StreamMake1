package TaskForPoint3.Task12;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task12 {
    public static void main(String[] args) {
        Integer[] integers = {212, 1094, 272, 113, 567, 6, 7};
        Stream<Integer> integerStream = Arrays.stream(integers);
        System.out.println(integerStream.min(Integer::compareTo).get());
    }
}
