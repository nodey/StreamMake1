package TaskForPoint7.Task24;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process() throws InterruptedException {

        for (int i = 0; i < 1024; i++) {
                System.out.println("[Producer] Put : " + i);
                queue.put(i);
                System.out.println("[Producer] Queue remainingCapacity : " + queue.remainingCapacity());
                Thread.sleep(100);

        }

    }

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}