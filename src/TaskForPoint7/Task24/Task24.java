package TaskForPoint7.Task24;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task24 {
        public static void main(String[] args) throws InterruptedException {

            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1024);

            new Thread(new Producer(queue)).start();
            new Thread(new Consumer(queue)).start();

        }

    }