package TaskForPoint7.Task26;

public class Task26 {
    public static void main(String[] args) {
        Test test = new Test();
        Test1 test1 = new Test1();
        test.func();
        test1.func();
        for(int j = 0; j < 10; j++){
            new MyThread().start();
        }
    }

    static class MyThread extends Thread{
        Test test = new Test();
        Test1 test1 = new Test1();
        @Override
        public void run() {
            test.func();
            test1.func();
        }
    }
}
