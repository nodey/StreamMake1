package TaskForPoint7.Task21;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        new MyThread().start();
    }


    static class MyThread extends Thread {
        int i;
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        @Override
        public void run() {
            if(integers.length < 100){
                System.out.println(Arrays.stream(integers).sum());
            }else{
                int stream = Arrays.stream(integers).limit(integers.length/2).sum();
                int stream1 = Arrays.stream(integers).skip(integers.length/2).sum();
                System.out.println(stream + stream1);
            }
        }
    }
}
