package TaskForPoint7.Task24;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            while (true) {
                while (queue.remainingCapacity() < 600 && queue.remainingCapacity() > 100) {
                    Integer take = queue.take();
                    process(take);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process(Integer take) throws InterruptedException {

                System.out.println("[Consumer] Take : " + take);
          //      Thread.sleep(5);
    }

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}
