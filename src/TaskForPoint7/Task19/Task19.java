package TaskForPoint7.Task19;

import java.util.Random;

public class Task19 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join(5000);
    }

    static  class MyThread extends Thread{
        Random random = new Random();
        int k = random.nextInt(100-10);

        @Override
        public void run() {
            System.out.println("Mission in process");
            try {
                Thread.sleep(k);
                System.out.println("Mission complete");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyThread1 extends Thread{
        Random random = new Random();
        int n = random.nextInt(100-10);
        @Override
        public void run() {
            for(int i = 0; i < n; i++) {
                System.out.println("Mission not complete");
            }
            }
    }
}
