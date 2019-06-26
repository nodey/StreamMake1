package TaskForPoint7.Task15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class Task15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Queue<Integer> queue = new LinkedList<>();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
      //  Callable callable0 = () -> queue.add(1);
        Callable callable = ()-> getI();
        Callable callable1 = ()-> queue.element();

      //  ScheduledFuture<Queue> scheduledFuture = scheduledExecutorService.schedule(callable0, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture<Integer> scheduledFuture1 = scheduledExecutorService.schedule(callable, 500, TimeUnit.MILLISECONDS);
        ScheduledFuture<Integer> scheduledFuture2 = scheduledExecutorService.schedule(callable1, 1000, TimeUnit.MILLISECONDS);

        System.out.println(queue.add(1));
        System.out.println(scheduledFuture1.get());
        System.out.println(scheduledFuture2.get());

        System.out.println("The end");
    }

    public static String getI(){
        return "Method was run";
    }
}