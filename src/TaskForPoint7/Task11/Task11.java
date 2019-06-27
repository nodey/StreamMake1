package TaskForPoint7.Task11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task11 {
    static Random random = new Random();
    static int min = 1;
    static int max = 100;
    static int n = random.nextInt();
    static int m = random.nextInt();
    public static void main(String[] args) {
        if(n > m * (min - max)){
            for(int i = 0; i < m; i++){
                new MyThread().start();
            }
        }else{
            System.out.println("Stop thread");
            Thread.currentThread().interrupt();
        }
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            int x = ThreadLocalRandom.current().nextInt(min, max);
            int y;
            y = (int) Math.log(x);
            System.out.println(y);
        }
    }
}
