package TaskForPoint3.Task14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task14 {
    public static void main(String[] args) {
        Points[] floats = new Points[4];

        List<Points> list = new ArrayList<>(Arrays.asList(floats));

        System.out.println(list.stream());
    }
}
