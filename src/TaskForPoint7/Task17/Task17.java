package TaskForPoint7.Task17;

import java.util.Random;

public class Task17 {
    public static void main(String[] args) throws InterruptedException {
        for(int j = 0; j < 10; j++){
            new MyThread().start();
            Thread.sleep(5000);
        }
    }

    static class MyThread extends Thread{

        Random random = new Random();
        int i = random.nextInt();

        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
