package TaskForPoint7.Task9;

public class Task9 {
    public static void main(String[] args) {
        MyThread myThread[] = new MyThread[10];

        for (int i = 0; i < myThread.length; i++){
            myThread[i] = new MyThread();
            myThread[i].start();

        }
    }
}