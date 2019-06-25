package TaskForPoint7.Task18;

import java.io.*;

public class Task18 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread.join();
    }

    static class MyThread2 extends Thread{
        @Override
        public void run() {
            System.out.println(calculateFactorial(100));
        }
        public static int calculateFactorial(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
            return result;
        }
    }

    static class MyThread extends Thread{

        String filePath = "C:\\maven/readmix.txt";
        String appendText = "1-100";

        @Override
        public void run() {
            System.out.println("Hello World!");
            appendUsingFileOutputStream(filePath, appendText);

        }




        private static void appendUsingFileOutputStream(String fileName, String data) {
            OutputStream os = null;
            try {
                os = new FileOutputStream(new File(fileName), true);
                os.write(data.getBytes(), 0, data.length());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThread1 extends Thread{

        int i;

        @Override
        public void run() {
            for(i = 0; i < 100; i++){
                System.out.println(i);
            }
        }
    }


}
