package TaskForPoint7.Task27;



public class Task27 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new MyThread().start();
        }
    }

    static class MyThread extends Thread{
        Test test = new Test();
        @Override
        public void run() {
            test.func();
            test.func1();
            test.func2();
        }
    }
}
