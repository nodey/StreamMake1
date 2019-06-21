package TaskForPoint7.Task3;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {

    static int count = 0;
    static List<Integer> integers = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            integers.add(i, count);
            }
        count++;

        System.out.println(integers);
    }
}
