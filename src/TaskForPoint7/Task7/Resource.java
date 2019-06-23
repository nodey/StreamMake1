package TaskForPoint7.Task7;

public class Resource {
    int i;

    public synchronized void incrI(){
        int i = this.i;
        i++;
        this.i = i;
    }
}
