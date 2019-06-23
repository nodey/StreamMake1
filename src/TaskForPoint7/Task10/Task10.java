package TaskForPoint7.Task10;

public class Task10 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            new MyThread().start();
        }
    }
}
