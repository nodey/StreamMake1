package TaskForPoint7.Task20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task20 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 10; i++){
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(1);
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(2);
                }
            });

            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(3);
                }
            });
        }
    }

    static class MyThread0 extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyThread1 extends Thread{
        @Override
        public void run() {
            System.out.println(2);
        }
    }

    static class MyThread2 extends Thread{
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
