package TaskForPoint3.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("123", "123123123123", "123123123123123", "13123123", "12312312312", "11231231");
        System.out.println(arrayList.stream()
                .filter(string->string.length()<=12).collect(Collectors.toList()));
    }
}
