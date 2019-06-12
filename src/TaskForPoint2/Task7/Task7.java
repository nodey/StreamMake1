package TaskForPoint2.Task7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        String[] values = {"log1", "log2", "log3"};
        Stream<String> stringStream = Arrays.stream(values);
        System.out.println(stringStream.map((s) -> s + "_outdated").collect(Collectors.toList()));
    }
}
