package TaskForPoint3.Task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
            Integer[] integers = new Integer[200];
            integers[0] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;
            integers[1] = 1;

            System.out.println(Arrays.stream(integers).count());
    }
}
