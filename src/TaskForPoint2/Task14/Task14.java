package TaskForPoint2.Task14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task14 {
    public static void main(String[] args) {
        String[] strings = {"13_12", "14_11", "16_09", "15_10", "17_8"};
        Task14.SortedStringArray(strings).forEach(value -> System.out.print(" "+value));
    }

    private static Comparator<String> comparator = (string1, string2) -> {
        int value1 = Integer.parseInt(string1.substring(string1.indexOf("_")+1));
        int value2 = Integer.parseInt(string2.substring(string2.indexOf("_")+1));
        return value2-value1;
    };

    private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static Stream SortedStringArray(String[] strings){
        return Arrays.stream(strings)
                .sorted((string1,string2)->comparator.compare(string1,string2))
                .filter(distinctByKey(string -> string.substring(string.indexOf("_")+1)));
    }
}
