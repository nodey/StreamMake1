package TaskForPoint7.Task16;

import java.util.concurrent.Exchanger;

public class Task16{
    public static void main(String[] args) throws InterruptedException {
        int j = (int) (Math.random() * 100);
        Exchanger<String> exchanger = new Exchanger<String>();
        for (int i = 0; i < j; i++) {
            Thread t1 = new MyThread(exchanger, "First example");
            Thread t2 = new MyThread(exchanger, "Four Example");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
    }
}

class MyThread extends Thread {

    Exchanger<String> exchanger;
    String message;
    MyThread(Exchanger<String> exchanger, String message) {
        this.exchanger = exchanger;
        this.message = message;
    }

    public void run() {
        try {
            System.out.println(this.getName() + " message: " + message);

            // exchange messages
            message = exchanger.exchange(message);

            System.out.println(this.getName() + " message: " + message);
        } catch (Exception e) {
        }
    }
}