package TaskForPoint3.Task25;

import java.util.Arrays;
import java.util.List;

public class Task25 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("123", "123123", "123123", "123123123");
        System.out.println(" div");
        stringList.stream()
                .forEach(string->{
                    System.out.println(" <ul>\n  <li>"+string+"</li>\n </ul>");
                });
        System.out.println(" /div");
    }
}
