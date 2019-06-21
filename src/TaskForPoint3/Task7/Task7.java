package TaskForPoint3.Task7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Task7.ProbabylityFrequency().forEach((value1,value2)-> System.out.println(" "+value1+" "+value2+"%"));
    }

    public static HashMap ProbabylityFrequency() throws IOException {
        long numberOFWords = Files.lines(Paths.get("C:\\maven/readmix.txt"))
                .map(string->new ArrayList<String>(Arrays.asList(string.split(" "))))
                .count();

        return new HashMap(
                FilterByMeetingFrequency()
                        .limit(10)
                        .collect(Collectors.toMap(x->x.getKey(), x->((float)x.getValue()/numberOFWords*100)))
        );
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
