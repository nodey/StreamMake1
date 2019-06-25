package TaskForPoint7.Task2;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        Exchanger<String> exchanger = new Exchanger();

        new Mike(exchanger, semaphore);
        new Anketa(exchanger, semaphore);
    }

    static class Mike extends Thread{
        Semaphore semaphore;
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger, Semaphore semaphore){
            this.exchanger = exchanger;
            this.semaphore = semaphore;
            start();
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                exchanger.exchange("Hi, hello..");
                exchanger.exchange("My name is...");
                sleep(1000);
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Anketa extends Thread{
        Semaphore semaphore;
        Exchanger<String> exchanger;

        public Anketa(Exchanger<String> exchanger, Semaphore semaphore){
            this.exchanger = exchanger;
            this.semaphore = semaphore;
            start();
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
