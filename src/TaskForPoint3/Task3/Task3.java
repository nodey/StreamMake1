package TaskForPoint3.Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Task3.FilterByMeetingFrequency().forEach(value -> System.out.println(" "+value));

    }
    public static Stream<Map.Entry<String,Long>> FilterByMeetingFrequency() throws IOException {
        return Files.lines(Paths.get("C:\\maven/readmix.txt"))
                .map(string->new ArrayList<String>(Arrays.asList(string.split(" "))))
                .reduce(new ArrayList<>(),(value1, value2)->{
                    value1.addAll(value2);
                    return value1;
                })
                .stream()
                .map(string-> {
                    if(string.contains("."))
                        string = string.substring(0,string.indexOf("."));
                    return string;
                }).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((value1,value2)->{
                    return  (int) (value2.getValue()-value1.getValue());
                });
    }
}
