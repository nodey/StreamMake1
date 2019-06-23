package TaskForPoint7.Task10;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    @Override
    public void run() {
        System.out.println(integerList.stream().max(Integer::compareTo).get());
    }
}
