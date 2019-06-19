package TaskForPoint3.Task21;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task21 {
    public static void main(String[] args) {
        Integer[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> integerStream = Arrays.stream(mas);
        System.out.println(integerStream.map(p->p + 1).collect(Collectors.toList()));


    }
}
