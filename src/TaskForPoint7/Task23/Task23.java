package TaskForPoint7.Task23;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task23 {
    public  static int x = (int) Math.random() * 10;
    public  static BlockingQueue<String> stringBlockingQueue = new ArrayBlockingQueue<String>(11);
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Example1", "Example2", "Example3", "Example4", "Example5", "Example6", "Example7",
                "Example8", "Example9", "Example10");

        stringBlockingQueue.addAll(stringList);
        Iterator iterator = stringBlockingQueue.iterator();
        if (x > 5){
            Thread.interrupted();
        }else{
            new MyThread().start();
        }
    }


    static class MyThread extends Thread{

        List<String> stringList = Arrays.asList("Example1", "Example2", "Example3", "Example4", "Example5", "Example6", "Example7",
                "Example8", "Example9", "Example10");
        Iterator iterator = stringBlockingQueue.iterator();
        @Override
        public void run() {


                try {
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                        Thread.sleep(x);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
