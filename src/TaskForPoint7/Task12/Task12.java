package TaskForPoint7.Task12;

import java.util.Random;

public class Task12 {
    static Random random = new Random();
    static int  i = random.nextInt(10-1);
    static int x = random.nextInt(10000-1000);
    public static void main(String[] args) throws InterruptedException {
        Decrementer decrementer = new Decrementer();
        decrementer.start();
        decrementer.join();
    }

    static class Decrementer extends Thread{
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
                while(i != 0) {
                    try {
                        Thread.sleep(x);
                        i--;
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            long stopTime = System.currentTimeMillis();
            System.out.println(stopTime - startTime);
                }
    }
}