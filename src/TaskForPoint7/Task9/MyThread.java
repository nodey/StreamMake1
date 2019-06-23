package TaskForPoint7.Task9;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
    List<Double> integerList = Arrays.asList(1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D);
    int count = 0;
    @Override
    public void run() {
       integerList.stream().map(x-> Math.pow(x, 2)).forEach(x-> System.out.println(x));

    }
}
