package TaskForPoint7.Task26;

public class Test {
    static int i = 0;

    public void func() {
        synchronized (this) {
            System.out.println(i);
        }
    }

    public void func1(){
        synchronized (this){
            i++;
            System.out.println(i);
        }
    }


}