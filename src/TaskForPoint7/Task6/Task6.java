package TaskForPoint7.Task6;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread[] = new MyThread[10];

        for (int i = 0; i < myThread.length; i++){
            myThread[i] = new MyThread();
            myThread[i].start();

        }MyThread.count++;
    }
}
