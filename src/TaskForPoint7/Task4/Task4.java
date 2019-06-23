package TaskForPoint7.Task4;


public class Task4 {
    public static void main(String[] args) {
        MyThread myThread[] = new MyThread[10];

        for (int i = 0; i < myThread.length; i++){
            myThread[i] = new MyThread();
            myThread[i].start();

        }MyThread.count++;
    }
}
