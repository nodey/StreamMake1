package TaskForPoint7.Task26;

public class Test1 {

    static int i = 0;

    public void func() {
        synchronized (this) {
            i++;
            System.out.println(i);
        }
    }
}