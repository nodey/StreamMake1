package TaskForPoint7.Task22;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task22 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        };
        int stream = Arrays.stream(ints).map(x->x/ints.length).sum();
        ExecutorService service = Executors.newFixedThreadPool(3);
            if(ints.length < 100){service.submit(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Arrays.stream(ints).average());
                }
            });}else{
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(stream);
                }
            });
        }
    }
}