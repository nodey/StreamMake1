package TaskForPoint3.Task13;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task13 {
    public static void main(String[] args) {
        Integer[] integers = {212, 1094, 272, 113, 567, 6, 7};
        Stream<Integer> integerStream = Arrays.stream(integers);
        System.out.println(integerStream.max(Integer::compareTo).get());
    }
}
