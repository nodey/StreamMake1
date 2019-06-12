package TaskForPoint2.Task5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        String[] values = {"1", "2", "3", "4", "5", "6", "7", "8"};
        Stream<String> stringStream = Arrays.stream(values);
        System.out.println(stringStream.filter("20"::equals).findFirst().orElse("42"));
    }
}
