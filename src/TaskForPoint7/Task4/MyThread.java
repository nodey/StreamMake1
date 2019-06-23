package TaskForPoint7.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyThread extends Thread {

    static int count = 0;
    static HashMap<String, Integer> integers = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            integers.put("Hello world", count);
        }
        count++;

        System.out.println(integers);
    }
}