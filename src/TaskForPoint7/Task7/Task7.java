package TaskForPoint7.Task7;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 0;
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();
        MyThread myThread6 = new MyThread();
        MyThread myThread7 = new MyThread();
        MyThread myThread8 = new MyThread();
        MyThread myThread9 = new MyThread();
        myThread.setResource(resource);
        myThread1.setResource(resource);
        myThread2.setResource(resource);
        myThread3.setResource(resource);
        myThread4.setResource(resource);
        myThread5.setResource(resource);
        myThread6.setResource(resource);
        myThread7.setResource(resource);
        myThread8.setResource(resource);
        myThread9.setResource(resource);
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread.join();
        myThread1.join();
        myThread2.join();
        myThread3.join();
        myThread4.join();
        myThread5.join();
        myThread6.join();
        myThread7.join();
        myThread8.join();
        myThread9.join();
        System.out.println(resource.i);
    }
}
