package TaskForPoint7.Task13;

public class MyThread extends Thread {

    @Override
    public  void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(i + " ");
        }
    }
}
