package TaskForPoint7.Task14;


public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();

        myThread1.start();
        myThread2.start();
        myThread3.start();

        myThread1.join();
        myThread2.join();
        myThread3.join();

    }
}

class MyThread1 extends Thread{
    WorkWithArray workWithArray;
    Double[] integers = {1D, 2D, 3D, 4D, 5D, 6D, 7D};

    @Override
    public void run() {
        workWithArray.upOne(integers);
        System.out.println(integers);
    }
}

class MyThread2 extends Thread{
    WorkWithArray1 workWithArray1;
    Double[] integers = {1D, 2D, 3D, 4D, 5D, 6D, 7D};

    @Override
    public void run() {
        workWithArray1.upOne1(integers);
        System.out.println(integers);
    }
}

class MyThread3 extends Thread{
    WorkWithArray2 workWithArray2;
    Double[] integers = {1D, 2D, 3D, 4D, 5D, 6D, 7D};

    @Override
    public void run() {
        workWithArray2.upOne2(integers);
        System.out.println(integers);
    }
}

class WorkWithArray{
    public static synchronized Double[] upOne(Double[] integers){
        for(int i = 0; i < integers.length - 4; i++){
            integers[i] = integers[i] + 1;
            integers[i] = integers[i] * 5;
            if(integers[i] > 30){
                integers[i] = integers[i]  - 7;
                integers[i] = Math.sqrt(integers[i]);
            }else{
                Math.pow(integers[i], 2);
            }
            integers[i] = integers[i]/2;
        }return integers;
    }
}

class WorkWithArray1{
    public static synchronized Double[] upOne1(Double[] integers){
        for(int i = 0; i < integers.length - 2; i++){
            integers[i] = integers[i] + 1;
            integers[i] = integers[i] * 5;
            if(integers[i] > 30){
                integers[i] = integers[i]  - 7;
                integers[i] = Math.sqrt(integers[i]);
            }else{
                Math.pow(integers[i], 2);
            }
            integers[i] = integers[i]/2;
        }return integers;
    }
}

class WorkWithArray2{
    public static synchronized Double[] upOne2(Double[] integers){
        for(int i = 0; i < integers.length - 6 + 4; i++){
            integers[i] = integers[i] + 1;
            integers[i] = integers[i] * 5;
            if(integers[i] > 30){
                integers[i] = integers[i]  - 7;
                integers[i] = Math.sqrt(integers[i]);
            }else{
                Math.pow(integers[i], 2);
            }
            integers[i] = integers[i]/2;
        }return integers;
    }
}