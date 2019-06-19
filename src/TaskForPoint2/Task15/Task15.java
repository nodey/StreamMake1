package TaskForPoint2.Task15;

import java.util.stream.Stream;

public class Task15 {
    public static void main(String[] args) {
        Stream<? extends Number> listStream = Stream.of(1, 2, 3, 4.6, 4.5, 3.6);
        listStream.forEach(p-> System.out.println(p));
    }
}
