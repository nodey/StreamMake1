package TaskForPoint3.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        String[] strings = new String[1];
        Stream<String> stream = Arrays.stream(strings);

        List<String> streamList = new ArrayList<String>((Collection<? extends String>) stream);
    }
}
