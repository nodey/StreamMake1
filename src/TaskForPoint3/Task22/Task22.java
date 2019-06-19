package TaskForPoint3.Task22;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task22 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8};
        Stream<Integer> integerStream = Arrays.stream(integers);
        System.out.println(integerStream.filter(p->p %2 != 0).reduce((s1, s2)-> s1 + s2).orElse(0));
    }
}
